package Exchange;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 원화(KRW) 금액 입력 받기
        System.out.print("원(KRW) 금액을 입력하세요: ");
        String input = scanner.nextLine();
        BigDecimal krwAmount = new BigDecimal(input);

        // 현재 환율 정보 (실제 환율 정보를 반영해야 함)
        BigDecimal usdRate = new BigDecimal("1330.19"); // 예: 1 USD = 1330.19 KRW
        BigDecimal jpyRate = new BigDecimal("9"); // 예: JPY 환율, 실제 환율 정보를 사용해야 함

        // KRW를 USD로 환전
        BigDecimal usdAmount = krwAmount.divide(usdRate, 2, RoundingMode.HALF_UP);

        // KRW를 JPY로 환전 (JPY 환율은 예시이며 실제 환율 정보로 업데이트 필요)
        BigDecimal jpyAmount = krwAmount.divide(jpyRate, 2, RoundingMode.HALF_UP);

        // 결과 출력
        System.out.println("달러($) = " + usdAmount + " / JPY = " + jpyAmount);
    }
}