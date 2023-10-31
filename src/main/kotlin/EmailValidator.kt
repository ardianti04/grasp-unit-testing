//deklarasi objek EmailValidator
object EmailValidator {
    //fungsi isValidEmail yang menerima satu argumen, yaitu alamat email dalam bentuk string

    fun isvalidEmail(email:String):Boolean{

        // Ekspresi regex ini digunakan untuk memeriksa apakah alamat email sesuai dengan pola tertentu.
        val  emailRegex=Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\$");

        //memeriksa apakah alamat email yang diberikan cocok dengan pola yang ditentukan oleh ekspresi regex.
        return emailRegex.matches(email);
    }
}