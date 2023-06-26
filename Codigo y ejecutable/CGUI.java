import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CGUI extends JFrame {
    private static final long serialVersionUID = 1L;

    private JLabel labelMonth;
    private JPanel panelCalendar;
    private LocalDate currentMonth;
    private HashMap<LocalDate, ArrayList<String>> events;

    public CGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calendario");
        setSize(600, 500);
        setLocationRelativeTo(null);

        labelMonth = new JLabel("", SwingConstants.CENTER);
        panelCalendar = new JPanel(new GridLayout(0, 7));

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Establecer el color de fondo personalizado entre amarillo y naranja
        Color customColor = new Color(255, 200, 0);
        container.setBackground(customColor);

        container.add(panelCalendar, BorderLayout.CENTER);
        container.add(createArrowPanel(), BorderLayout.SOUTH);
        container.add(labelMonth, BorderLayout.NORTH);

        events = new HashMap<>();

        setVisible(true);

        currentMonth = LocalDate.now();
        mostrarCalendario();
    }

    private JPanel createArrowPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        JButton prevButton = new JButton("<");
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentMonth = currentMonth.minusMonths(1);
                if (currentMonth.isBefore(LocalDate.of(2023, 6, 1))) {
                    currentMonth = LocalDate.of(2023, 6, 1);
                }
                mostrarCalendario();
            }
        });

        JButton nextButton = new JButton(">");
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentMonth = currentMonth.plusMonths(1);
                if (currentMonth.isAfter(LocalDate.of(2023, 12, 1))) {
                    currentMonth = LocalDate.of(2023, 12, 1);
                }
                mostrarCalendario();
            }
        });

        JButton backButton = new JButton("Volver");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Principalp principal = new Principalp();
                principal.setBounds(0, 0, 550, 550);
                principal.setVisible(true);
                principal.setResizable(false);
                principal.setLocationRelativeTo(null);
                dispose();
            }
        });

        panel.add(prevButton);
        panel.add(nextButton);
        panel.add(backButton);

        return panel;
    }

    private void mostrarCalendario() {
        int year = currentMonth.getYear();
        int month = currentMonth.getMonthValue();

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = firstDayOfMonth.getDayOfWeek();
        int daysInMonth = firstDayOfMonth.lengthOfMonth();

        panelCalendar.removeAll();

        String[] weekDays = {"Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"};
        for (String day : weekDays) {
            JLabel label = new JLabel(day, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 16));
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panelCalendar.add(label);
        }

        for (int i = 1; i < firstDayOfWeek.getValue(); i++) {
            panelCalendar.add(new JLabel(""));
        }

        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            JLabel label = new JLabel(String.valueOf(day), SwingConstants.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            label.addMouseListener(new MouseClickListener(date));
            panelCalendar.add(label);
        }

        labelMonth.setText(firstDayOfMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + year);
        panelCalendar.revalidate();
        panelCalendar.repaint();
    }

    private class MouseClickListener extends MouseAdapter {
        private LocalDate date;

        public MouseClickListener(LocalDate date) {
            this.date = date;
        }

        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) {
                showEventDialog(date);
            }
        }
    }

    private void showEventDialog(LocalDate date) {
        JDialog dialog = new JDialog(this, "Eventos del dia " + date.getDayOfMonth(), true);
        dialog.setSize(300, 200);
        dialog.setLocationRelativeTo(this);

        JPanel panel = new JPanel(new GridLayout(0, 1));
        ArrayList<String> eventList = events.getOrDefault(date, new ArrayList<>());

        for (String event : eventList) {
            JLabel label = new JLabel(event);
            panel.add(label);
        }

        JButton addButton = new JButton("Agregar Evento");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String event = JOptionPane.showInputDialog(dialog, "Ingrese el evento:");
                if (event != null && !event.isEmpty()) {
                    eventList.add(event);
                    events.put(date, eventList);
                    showEventDialog(date);
                }
            }
        });

        JButton deleteButton = new JButton("Eliminar Evento");
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (eventList.isEmpty()) {
                    JOptionPane.showMessageDialog(dialog, "No hay eventos para eliminar.");
                } else {
                    String selectedEvent = (String) JOptionPane.showInputDialog(dialog, "Seleccione el evento a eliminar:", "Eliminar Evento",
                            JOptionPane.QUESTION_MESSAGE, null, eventList.toArray(), eventList.get(0));

                    if (selectedEvent != null) {
                        eventList.remove(selectedEvent);
                        events.put(date, eventList);
                        showEventDialog(date);
                    }
                }
            }
        });

        dialog.add(panel, BorderLayout.CENTER);
        dialog.add(addButton, BorderLayout.SOUTH);
        dialog.add(deleteButton, BorderLayout.NORTH);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        CGUI gui = new CGUI();
    }
}
