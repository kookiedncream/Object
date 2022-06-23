package chapter_two.domain.policy;

import chapter_two.domain.Money;
import chapter_two.domain.Screening;
import chapter_two.domain.condition.DiscountCondition;

public class AmountDiscountPolicy extends DiscountPolicy {
	private Money discountAmount;

	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}
