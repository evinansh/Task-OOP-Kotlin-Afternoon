package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val inputString = "789"

    try {
        val number = inputString.toInt()
        println("Angka yang berhasil dikonversi: $number")
        } catch (e: NumberFormatException) {
            println("Gagal mengonversi string ke angka. Pesan error: ${e.message}")
        }
    }
