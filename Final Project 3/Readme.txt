Nama : Tegar Pandji Asmoro
A.Menggunakan Website Ebay dengan pencarian super sentai
	a. Website Test
		- Login : Merupakan Halaman Login website Ebay 
		- Home : Halaman Utama pada website dan mencari produk 'Super Sentai'
		- Checkout : Halaman deskirpsi produk lalu klik langsung masuk ke keranjang dan ke halaman checkout

	b. Object Respositori
		- Element (Untuk Website Test):
			1. Page_Electronics, Cars, Fashion, Collectibles  More  eBay = Element Halaman Home
			2. Page_Sign in or Register  eBay = Element Login
			3. Page_super sentai for sale  eBay = Element Produk (Tampilan mencari produk)
			4. Page_Bandai Super Mini Pla Shinka Gattai Ky_b31ac9  dan 
	   		   Page_Bandai Super Mini Pla Shinka Gattai Kyoryu Sentai Zyuranger Daizyujin 5 Pack New  eBay = element add to cart
			5. Page_eBay shopping cart (1) = element checkout
	c. data file 
		- User yang berisikan:
			a. Username/email
			b. Password dalam bentuk binary
	d. keyword
		berisikan :
			a. Login.groovy yang berisikan perintah untuk Login
	e. Test Suites
		berisikan :
			a. Web Test : yang menjalankan semua Webtest yang dimulai dari Login,Home dan Checkout

B.Menggunakan Android pada Applikasi Shopee pencarian Megazord
	a. Website Test
		- Login : Merupakan halaman awalan dan menuju ke halaman login pada shopee 
		- Home : Halaman Utama pada website dan mencari produk 'Megazord'
		- Checkout : Halaman deskirpsi produk lalu klik langsung masuk ke keranjang dan ke halaman checkout
	b. Object Respository 
		1. android.widget.Button - MULAI' = pada tampilan awalan masuk pertama shopee
		2. android.widget.ImageView = icon akun pada shopee
		3. android.view.ViewGroup= tombol login
		4. android.widget.EditText - No. HandphoneEmailUsername = Text Input Username
		5. android.widget.EditText - Password= klik kolom input text password
		6. android.widget.EditText - Password = Text Input Password
		7. android.widget.TextView - Log In = Klik Login
		8. android.widget.TextView - Atur Nanti = Verifikasi sidik jari
		9. android.widget.FrameLayout (1) = klik menu home
		10.android.widget.TextView - Box Container = Klik kolom pencarian
		11.android.widget.EditText'), 'Megazord' = input text kolom pencarian 
		12.android.view.ViewGroup (1) = klik hasil rekomendasi pada kolom pencarian 
		13.android.widget.TextView - Megazord Part - Abaranger, Ninja Steel, Folcon = Klik produk
		14.android.view.ViewGroup (2) = klik tambah keranjang 
		15.android.view.ViewGroup (3) = klik pilihan produk yang akan ditambahkan ke dalam keranjang
		16.android.view.ViewGroup (4) = klik masukkan keranjang
		17.android.view.ViewGroup (7) = klik ikon keranjang
		18.android.widget.ImageView (1) = klik centang semua produk yang akan di checkout
		19.android.view.ViewGroup (1) (1)= klik tombol checkout 
	c. Test Suites
		berisikan :
		a. Mobile Test : yang menjalankan semua mobiletest yang dimulai dari Login,Home dan Checkout
C. Performance Test
	a. Metode yang digunakan POST dan Get
