import javax.swing.JOptionPane;;
public class TrueFalseQuestion extends Question{
    String ask() {
        while(true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") || answer.equals("n") || answer.equals("no") || answer.equals("No") || answer.equals("NO") || answer.equals("F") || answer.equals("N")){
            answer = "FALSE";
            return answer;
            } else if (answer.equals("t") || answer.equals("true") || answer.equals("True") || answer.equals("TRUE") || answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("YES") || answer.equals("T") || answer.equals("yes")){
                answer = "True";
                return answer;
            } else {
                JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
            }
            
        }
    }

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: "+question;
        answer = answer.toUpperCase();

        if (answer.equals("f") || answer.equals("false") || answer.equals("False") || answer.equals("FALSE") || answer.equals("n") || answer.equals("no") || answer.equals("No") || answer.equals("NO") || answer.equals("F") || answer.equals("N")){
            correctAnswer = "FALSE";
        }
        if (answer.equals("t") || answer.equals("true") || answer.equals("True") || answer.equals("TRUE") || answer.equals("y") || answer.equals("Y") || answer.equals("Yes") || answer.equals("YES") || answer.equals("T") || answer.equals("yes")){
            correctAnswer = "True";
        }
    }
}
