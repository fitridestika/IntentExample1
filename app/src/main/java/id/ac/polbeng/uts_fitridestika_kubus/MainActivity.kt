package id.ac.polbeng.uts_fitridestika_kubus


import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.uts_fitridestika_kubus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol untuk menghitung luas dan volume kubus
        binding.btnHitung.setOnClickListener {
            val sisiStr = binding.edtSisi.text.toString()

            if (sisiStr.isNotEmpty()) {
                val sisi = sisiStr.toDouble()

                // Menghitung luas permukaan dan volume
                val luasPermukaan = 6 * (sisi * sisi)
                val volume = sisi * sisi * sisi

                // Menampilkan hasil
                binding.tvLuas.text = "Luas Permukaan: $luasPermukaan cm²"
                binding.tvVolume.text = "Volume: $volume cm³"
            } else {
                Toast.makeText(this, "Masukkan panjang sisi terlebih dahulu", Toast.LENGTH_SHORT).show()
            }
        }
    }
}