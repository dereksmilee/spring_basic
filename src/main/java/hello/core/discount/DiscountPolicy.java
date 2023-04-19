package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    /**
     * @return 할인 대상 금액
     */
    // F2를 누르면 오류난곳으로 이동
    int discount(Member member, int price);

}
