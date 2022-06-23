package chapter_two.domain.policy;

import chapter_two.domain.Money;
import chapter_two.domain.Screening;
import chapter_two.domain.condition.DiscountCondition;

public class PercentDiscountPolicy extends DiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return screening.getMovieFee().times(percent);
	}
}
