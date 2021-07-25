package SpringQ2;

import java.util.List;

public class QuestionList {
	
int questionId;
String question;
List<String> answers;

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
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
@Override
public String toString() {
	return "\nquestionId: " + questionId + "\nquestion: " + question + "\nanswers:" + answers;
}




}
