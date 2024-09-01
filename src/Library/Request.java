package Library;

import javax.swing.*;

public class Request {

    // Request an integer
    public static int requestInt(String message) {
        int value = 0;
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(null, message);
                value = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
            }
        }
        return value;
    }

    // Request a double
    public static double requestDouble(String message) {
        double value = 0.0;
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(null, message);
                value = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid decimal number.");
            }
        }
        return value;
    }

    // Request a float
    public static float requestFloat(String message) {
        float value = 0.0f;
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(null, message);
                value = Float.parseFloat(input);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid decimal number.");
            }
        }
        return value;
    }

    // Request a long
    public static long requestLong(String message) {
        long value = 0L;
        boolean valid = false;
        while (!valid) {
            try {
                String input = JOptionPane.showInputDialog(null, message);
                value = Long.parseLong(input);
                valid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid long number.");
            }
        }
        return value;
    }

    // Request a boolean
    public static boolean requestBoolean(String message) {
        boolean value = false;
        boolean valid = false;
        while (!valid) {
            String input = JOptionPane.showInputDialog(null, message + " (si/no o true/false)");
            if (input.equalsIgnoreCase("si") || input.equalsIgnoreCase("true")) {
                value = true;
                valid = true;
            } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("false")) {
                value = false;
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null, "Please enter 'yes' or 'no' or 'true' or 'false'.");
            }
        }
        return value;
    }

    // Request a string
    public static String requestString(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}

