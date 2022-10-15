public class Quiz {
    public static void main (String[] args) {

        Question questionOne = new MultipleChoiceQuestion("Which of the following programming language is an Object Oriented Programming Language ?","HTML", "CSS", "Fortan", "Java","Cobol", "d");
        questionOne.check();
        questionOne.showResults();

        Question questionTwo = new MultipleChoiceQuestion("Which of the following is NOT a data type in Java ?","String", "Special", "Boolean", "Int","Float", "b");
        questionTwo.check();
        questionTwo.showResults();

       Question questionThree = new MultipleChoiceQuestion("What is the full meaning of JDK ?","Java Development Kit", "Java Department of kids", "Junks Development kites", "Judge Donald Kings","Just Do kit", "a");
        questionThree.check();
        questionThree.showResults();

        Question questionFour = new MultipleChoiceQuestion("Java is compiled into _____ ?","0s and 1s", " Terabytecodes", "Bytecodes", "Jbytescodes","Megabytescodes", "c");
        questionFour.check();
        questionFour.showResults();

        Question questionFive = new MultipleChoiceQuestion("Java compiled file extension is _____ ?",".java", ".jv", ".compile", ".c",".class", "e");
        questionFive.check();
        questionFive.showResults();

        Question questionSix = new TrueFalseQuestion("Java can work on any operating system ?", "TRUE");
        questionSix.check();
        questionSix.showResults();

        Question questionSeven = new TrueFalseQuestion("HTML can can be used in place of Java ?", "FALSE");
        questionSeven.check();
        questionSeven.showResults();

        Question questionEight = new TrueFalseQuestion("Java can be compiled by python compiler ?", "FALSE");
        questionEight.check();
        questionEight.showResults();

        Question questionNine = new TrueFalseQuestion("The following are terms used in Java: method, constructor, block and class ?", "TRUE");
        questionNine.check();
        questionNine.showResults();

        Question questionTen = new TrueFalseQuestion("SyntaxError is a type of error ?", "TRUE");
        questionTen.check();
        questionTen.showResults();
    
    }
    
        
}
