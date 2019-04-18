package edu.cdu.xeon.sprint1.s299806.task1.after;

public class QuizFactory {
  
public Quiz makeQuiz(QuizProperty property, int count) throws IllegalArgumentException{ if (count > property.getAllProblems().size())
throw new IllegalArgumentException("The number of problems in quiz must be less than "+property.getAllProblems().size());
Random rnd = new Random(); Vector quizChosen = new Vector(); Hashtable quizLooked = new Hashtable(); BasicProblemParser parser = new BasicProblemParser(); try{

while (quizChosen.size() < count){

int i = rnd.nextInt(property.getAllProblems().size()); String prob = (String)property.getAllProblems().get(i); if (!quizLooked.containsKey(prob)){

quizLooked.put(prob,prob);
parser.parse(prob);
quizChosen.add( new Problem( prob,parser.calculate()));
}
}
}catch(IllegalArgumentException iae){
throw new IllegalArgumentException("The quiz type "+property.getType "'s problem is in an illegal format. & "+iae);
}

return new Quiz(property.getType(), quizChosen);

}

}

}
//QuizFactory class after Move Method applied
