import java.io.FileWriter; //imports of java functions
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;

public class ALSSurvey {
 
	public static String gender;
	public static String grade;
	public static boolean question1;
	public static boolean question2;
	public static boolean question3;
	public static int recommend;
	public static int donation;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		JList<?> genders = new JList<Object>(new String[] { "Male", "Female", "Other" });
		JList<?> grades = new JList<Object>(new String[] { "9", "10", "11", "12", "Other" });

		boolean run = true;

		System.out.println("Enter file number to start from: ");
		int i = in.nextInt();
		int j = 0;
		while (run == true) {
			run = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Enter data?", "Start",
					JOptionPane.YES_NO_OPTION);
			if (run == true) {
				info();
				gender = gender(genders);
				grade = grade(grades);
				question1 = multipleChoice1();
				question2 = multipleChoice2();
				question3 = multipleChoice3();
				recommend = sliderquestion();
				donation = sliderDonation();
				try {
					writeToFile(i);
				} catch (IOException e) {
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,
						"Thank you for completing this survey.",
						"Thank you!", JOptionPane.OK_OPTION);
				i++;
				j++;
			}
			if (run == false) {
				JOptionPane.showMessageDialog(null,
						"Thank you for completing this survey." + "\n" + j
								+ " new file(s) have been made as a part of this session.",
						"Thank you!", JOptionPane.OK_OPTION);
			}
		}
	in.close();

	}

	public static void writeToFile(int i) throws IOException {
		FileWriter fw = new FileWriter("survey_" + i + ".txt");

		fw.write(gender + "\n");
		fw.write(grade + "\n");
		fw.write(question1 + "\n");
		fw.write(question2 + "\n");
		fw.write(question3 + "\n");
		fw.write(recommend + "\n");
		fw.write(donation + "\n");

		fw.close();

	}

	public static void info() {
		// a short introduction to the ALS Disease and what is does to a human
		JOptionPane.showMessageDialog(null,
				"ALS stands for Amyotrohpic Lateral Sclerosis. It is a degenerative disease which affects a patient's motor neurons. "
						+ "\nALS is a condition which takes a long time to diagnose, sometimes taking the course of 12 to 14 months, which makes it deadly, as the disease may already "
						+ "\nhave started progression by the time of diagnosis. ALS is also a very expensive disease with the costs of equipment and treatment skyrocketing to $150,000 - $250,000. "
						+ "\nIt is a disease which slowly affects the patient's ability to talk, move, and breathe.",
				"ALS Information for the Curious", JOptionPane.INFORMATION_MESSAGE);
	}

//input for the gender and grades
	public static String gender(JList<?> genders) {
		String answer = "None Selected";
		JOptionPane.showMessageDialog(null, genders, "Select Your Gender", JOptionPane.QUESTION_MESSAGE);
		answer = (String) (genders.getSelectedValue());
		System.out.println(answer);
		return answer;
	}

	public static String grade(JList<?> grades) {
		JOptionPane.showMessageDialog(null, grades, "Select Your Grade", JOptionPane.QUESTION_MESSAGE);
		String answer = (String) (grades.getSelectedValue());
		System.out.println(answer);
		return answer;
	}

	public static boolean multipleChoice1() {
		boolean answer = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"Do you plan to attend the Walk to End ALS event on April 25th?", "Question 1", JOptionPane.YES_NO_OPTION);
		System.out.println(answer);
		return answer;
	}

	public static boolean multipleChoice2() {
		boolean answer = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"Did you participate in the ALS ice bucket challenge?", "Question 2", JOptionPane.YES_NO_OPTION);
		System.out.println(answer);
		return answer;
	}

	public static boolean multipleChoice3() {
		boolean answer = JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null,
				"Do you know anybody affected by ALS in the community?", "Question 3", JOptionPane.YES_NO_OPTION);
		System.out.println(answer);
		return answer;
	}

	// slider question for recommending the event
	public static int sliderquestion() {
		int answer = 0;
		JFrame parent = new JFrame();

		JOptionPane optionPane = new JOptionPane();
		JSlider slider = getSlider(optionPane);
		optionPane.setMessage(new Object[] {
				"How likely are you to recommend this event to a friend or family member" + "?", slider });
		optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		JDialog dialog = optionPane.createDialog(parent, "Question // Slider Question");

		dialog.setVisible(true);
		try {
			answer = (int) optionPane.getInputValue();
		} catch (ClassCastException e) {
			e.printStackTrace();
			answer = 0;
		}
		System.out.println("Input: " + optionPane.getInputValue());
		return answer;
	}

	static JSlider getSlider(final JOptionPane optionPane) {
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider.setMajorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		ChangeListener changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
				JSlider theSlider = (JSlider) changeEvent.getSource();
				if (!theSlider.getValueIsAdjusting()) {
					optionPane.setInputValue(new Integer(theSlider.getValue()));
				}
			}
		};
		slider.addChangeListener(changeListener);
		return slider;
	}

	public static int sliderDonation() {
		int answer = 0;
		JFrame parent = new JFrame();

		JOptionPane optionPane = new JOptionPane();
		JSlider slider = getDonationSlider(optionPane);
		optionPane.setMessage(new Object[] { "How much are you willing to donate" + "?", slider });
		optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);
		JDialog dialog = optionPane.createDialog(parent, "Question Eight // Slider Question");

		dialog.setVisible(true);
		System.out.println("Input: " + optionPane.getInputValue());
		try {
			answer = (int) optionPane.getInputValue();
		} catch (ClassCastException e) {
			e.printStackTrace();
			answer = 10;
		}
		return answer;
	}

	static JSlider getDonationSlider(final JOptionPane optionPane) {
		JSlider slider = new JSlider(JSlider.VERTICAL, 0, 150, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		ChangeListener changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
				JSlider theSlider = (JSlider) changeEvent.getSource();
				if (!theSlider.getValueIsAdjusting()) {
					optionPane.setInputValue(new Integer(theSlider.getValue()));
				}
			}
		};
		slider.addChangeListener(changeListener);
		return slider;
	}

}
