public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String evenOrOdd(int number){
        if (number % 2 == 0){
            return "even";
        }else return "odd";
    }
    public static String teacherOrStudent(String name){
        if (name.equals("Kalisz")){
            return "Teacher";
        } else return "Student";
    }
    public static int fartherFromZero(int number){
        if (number > 0){
            return number+5;
        } else if(number < 0) {
            return number-5;
        } else {
            return 0;
        }
    }
    public static String isFive(int number){
        if (number == 5){
            return "The number is Five";
        } else return "The number is not Five";
    }
    public static String positiveOrNegative(double number){
        if (number <= 0){
            return "Negative";
        } else return "Positive";
    }
    public static String highOrLow(int number){
        if (number > 100){
            return "High";
        } else return "Low";
    }
    public static String isHello(String sr){
        if (sr.equals("Hello")){
            return "The word is Hello";
        } else return "The word is not Hello";
    }
	//Write your functions here

}
