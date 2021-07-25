package SpringQ2;

import java.util.Set;

public class QuestionSet {
	
int questionId;
String question;
Set<String> answers;

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
public Set<String> getAnswers() {
	return answers;
}
public void setAnswers(Set<String> answers) {
	this.answers = answers;
}

@Override
public String toString() {
	return "\nquestionId: " + questionId + "\nquestion: " + question + "\nanswers:" + answers;
}


}
