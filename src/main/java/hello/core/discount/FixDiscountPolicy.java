package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount  = 1000;
    @Override
    //정액할인정책
    public int discount(Member member, int price) {
        // enum 타입은 ==을 쓴다
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else{
            return 0;

        }
    }
}

