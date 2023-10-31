import com.google.common.truth.Truth
import org.junit.jupiter.api.Test


class emailValidatorTest {
    @Test
    //fungsi pengujian
    fun correctEmailTest(){

        //alamat email disimpan dalam variabel email.
        val email="ardiantisimanjuntak5@gmail.com";

        //dipanggil untuk memeriksa apakah alamat email tersebut valid.
        Truth.assertThat(EmailValidator.isvalidEmail(email)).isTrue();
    }
}