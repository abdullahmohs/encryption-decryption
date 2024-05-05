package decription;

import java.util.Stack;

public class Decription {

    public static void main(String[] args) {

        Stack stack = new Stack();
        int startIndex = -1, endIndex = -1;
        String encryptedMessage = " seaside the to sent be to ne2ds army ten of team a ";
        if (encryptedMessage.length() >= 1 && encryptedMessage.length() <= Math.pow(10, 5)) {
            for (int i = 0; i < encryptedMessage.length(); i++) {
                if (encryptedMessage.charAt(i) == ' ') {
                    startIndex = i;
                    for (int j = i + 1; j < encryptedMessage.length(); j++) {
                        if (encryptedMessage.charAt(j) == ' ') {
                            endIndex = j;
                            stack.push(encryptedMessage.substring(startIndex, endIndex));
                            break;
                        }
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();

    }
}
