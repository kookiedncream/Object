package chapter_two.domain.policy;

import chapter_two.domain.Money;
import chapter_two.domain.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
	@Override
	protected Money getDiscountAmount(Screening screening) {
		return Money.ZERO;
	}
}
