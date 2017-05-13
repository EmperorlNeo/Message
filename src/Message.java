import javax.swing.JOptionPane;
public class Message {


public static void main(String[] args) {
String name=JOptionPane.showInputDialog(null,"What's your name?");
String age=JOptionPane.showInputDialog(null,"What is your age, "+name+ "?");
int numAge=Integer.parseInt(age);
String name2=JOptionPane.showInputDialog(null,"What is your name?");
String age2=JOptionPane.showInputDialog(null,"What is your age, "+name2+ " ?");
int numAge2=Integer.parseInt(age2);
if(numAge>numAge2){
JOptionPane.showMessageDialog(null, name+" is older by "+(numAge-numAge2)+ " years.");
}
else{
	JOptionPane.showMessageDialog(null, name+" is younger by "+(numAge2-numAge)+" years.");
}


	
}

}