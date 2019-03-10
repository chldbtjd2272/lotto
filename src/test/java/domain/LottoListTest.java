package domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoListTest {

    @Test
    public void 가격을_넣었을때_가격만큼_로또생성() {
        //given
        long price = 14000;
        //when
        LottoList lottoList = new LottoList(price);
        //then
        assertThat(lottoList.getLottos().size()).isEqualTo(14);
    }
}