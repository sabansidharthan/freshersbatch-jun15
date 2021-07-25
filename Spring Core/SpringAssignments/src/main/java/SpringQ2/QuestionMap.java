package SpringQ2;

import java.util.Map;

public class QuestionMap {
	
	int questionId;
	String question;
	
	Map<Integer,String> answers;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	
	@Override
	public String toString() {
		return "\nquestionId: " + questionId + "\nquestion: " + question + "\nanswers:" + answers;
	}
	

}
