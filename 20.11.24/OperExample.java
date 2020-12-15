package jojo;

import java.util.function.IntBinaryOperator;

public class OperExample {
	static int[] scores = {99,98,97};
	static int maxOrmin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score:scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
}
