package chapter_two.domain.condition;

import chapter_two.domain.Screening;

public interface DiscountCondition {
	boolean isSatisfiedBy(Screening screening);
}
