package com.app.godphotos;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<customitem> itemList;
    RecyclerView recyclerView;
    RecycleViewAdapter recycleViewAdapter;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        AdSize adsize = new AdSize(300,50);
// TODO: Add adView to your view hierarchy.


        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        itemList = new ArrayList<>();

        itemList.add(new customitem("https://i.pinimg.com/originals/75/ef/6f/75ef6fe62a9de4370e173b1272e2ba86.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/66-661038_lord-shiva-om-namah-shivaya.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/248-2483711_shiv-ji-wallpaper-download-om-namah-shivay-hd.jpg"));
        itemList.add(new customitem("https://play-lh.googleusercontent.com/phNbMBvmuDqzGj24airwqtc_al3uv8hZ_shbHTiYDgV5NMa1Sr1RM5y53cYNbw0z9E3R"));
        itemList.add(new customitem("https://i.pinimg.com/originals/b5/ab/28/b5ab2803533f9b1eb3faa6ea70bd76e5.jpg"));
        itemList.add(new customitem("https://www.bhaktiphotos.com/wp-content/uploads/2018/04/Bhagwan-Shiv-Shankar-Photos.jpg"));
        itemList.add(new customitem("https://c0.wallpaperflare.com/preview/471/717/134/france-lucay-le-male-new-mayapur-deity.jpg"));
        itemList.add(new customitem("https://a10.gaanacdn.com/images/playlists/58/27610558/crop_480x480_27610558_1545389057.jpg"));
        itemList.add(new customitem("https://c0.wallpaperflare.com/preview/175/55/746/lord-lord-ganesha-ganesha-hindu.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/62/e4/e0/62e4e0e0cb9a754d7bffe5d262e1d4e6.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d1/ec/25/d1ec25e3dbd20b539bf0dabbd6c0e543.jpg"));
        itemList.add(new customitem("https://www.hdnicewallpapers.com/Walls/Big/God%20and%20Lord/God_Mahadev_Shiv_Shankar.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/e2/80/f4/e280f4eb137996a68cfc37b282dd0bc3.png"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/758868.jpg"));
        itemList.add(new customitem("https://cdn.dollsofindia.com/images/p/sequin-art-paintings/dwarkadheesh-GE83_l.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp5944740.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/3b/d3/54/3bd35486f358097f19da811c14cb6952.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/3e/e7/f7/3ee7f7e76706571e75a675b3fe2317a1.jpg"));
        itemList.add(new customitem("https://oyewallpaper.com/public/uploads/preview/krishna-murti-wallpaper-download-61-11604471475z2hhoxmflu.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/bc/da/1c/bcda1c730d1043d9d693c746cd483b89.jpg"));

        itemList.add(new customitem("https://images.unsplash.com/photo-1598195596234-e04b82ef8adf?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTl8fGdhbnBhdGl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80"));
        itemList.add(new customitem("https://www.bhagwankiphotos.com/wp-content/uploads/2018/12/Maha-Ganesha-God-Wallpaper.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7421108.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp5281244.jpg"));
        itemList.add(new customitem("https://lh4.googleusercontent.com/proxy/1oErD4EDslqibJpnTKfRLUTA2L6SLdMlkcQ2acAtphaxw9u7KHBWfqNt-ofQT2PwyRJVxWwLyqKbBAZJd2eZfWjnbOtbOPxnopvbozKNxLGlrBX5pFTbbi5E3hKJ9KWTPl0moNnssT4rK-Ig8krpscg=s0-d"));
        itemList.add(new customitem("https://i.pinimg.com/736x/9b/11/d4/9b11d4ad3559a0fd4c9a3963f7fcbc4e.jpg"));
        itemList.add(new customitem("https://images.unsplash.com/photo-1583089892943-e02e5b017b6a?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/343-3431774_free-krishna-hd-wallpapers-god-wallpaper-download-full.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a3/f1/c9/a3f1c93cdbed85e5b404730c2c38d1e2.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/19-197942_animated-hanuman-hd-wallpapers-iphone-god-wallpaper-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d2/45/0d/d2450ddd056b4516531472f4717df940.jpg"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/05/lord-krishna-phone-background-576x1024.png"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp2610482.png"));
        itemList.add(new customitem("https://www.hdwallpapers.in/download/lord_shiva_2-HD.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a9/e8/e4/a9e8e410fcfd02847cf26030233f5ed4.png"));
        itemList.add(new customitem("https://c0.wallpaperflare.com/preview/175/55/746/lord-lord-ganesha-ganesha-hindu.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/30/02/51/3002515e82241625eef536fe02c76f22.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp3248602.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/2372521.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/2476575.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/7f/b1/c1/7fb1c1220413aa0010cb5ea552a9d782.jpg"));
        itemList.add(new customitem("https://www.prokerala.com/images/1200x675/happy-ram-navami-2020-wishes.jpg"));
        itemList.add(new customitem("https://amp.ikimaru.com/pic/4934443_full-ma-2019-wallpaper-navratri-images-navratri-images-hd-navratri-durga-ma-images.png"));
        itemList.add(new customitem("https://i.pinimg.com/originals/50/55/00/50550064aca24639fdb4c2995444b946.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/47/c9/48/47c948a38d3c28992785faf6aff142a2.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/3260976.jpg"));
        itemList.add(new customitem("https://www.hindugodwallpaper.com/images/gods/zoom/3401_iskcon-krishna-wallpapers-hd.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1803677.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/10/bd/cc/10bdcca0e7bce73270a7283f83fd623c.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/134-1345398_maa-durga-wallpaper-full-size-free-download-jai.jpg"));
        itemList.add(new customitem("https://www.desktopbackground.org/download/o/2015/02/25/908287_lord-shri-ram-chandra-ji-shiva-ramayana-hd-full-hd-wallpapers-for_1024x768_h.jpg"));
        itemList.add(new customitem("https://mygodimages.com/public/uploads/preview/drawing-hd-krishna-wallpaper-download-44-11604213510kgaqxsy9vj.jpg"));
        itemList.add(new customitem("https://www.bhagwanbhajan.com/maa-durga/maa-durga-hd-wallpapers/durga-mata-new-hd-images-download.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/205-2055011_lord-ganesha-hd-wallpapers-images-13983.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/43-433798_hindu-god-images-in-hd-lord-shiva.jpg"));
        itemList.add(new customitem("https://avante.biz/wp-content/uploads/Bal-Krishna-HD-wallpaper-for-mobile/Bal-Krishna-HD-wallpaper-for-mobile26.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/52/45/37/524537a342184a596e183326b34dfdb1.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/07/e7/60/07e7603000b93612a6416166820cdffc.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1103433.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/81/7e/90/817e9034064a41995af3383530517115.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/17-176289_radha-krishna-images-hd.jpg"));
        itemList.add(new customitem("https://myimgstock.com/public/uploads/preview/bal-ganehs-baby-lord-ganesha-wallpapers-11609557318ylsafbokn8.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7010178.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7314140.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d6/b1/42/d6b1429b1ac1d40e04e00eb3393584ce.gif"));
        itemList.add(new customitem("https://image.winudf.com/v2/image/Y29tLnRhYmtlZXkuZHdhcmthZGhpc2h3YWxscGFwZXJzaGRfc2NyZWVuXzNfMTUyNzkwNTg5OF8wODI/screen-3.jpg?fakeurl=1&type=.jpg"));
        itemList.add(new customitem("https://c4.wallpaperflare.com/wallpaper/771/2/557/god-lord-krishna-wallpaper-preview.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/4d/56/ce/4d56ce88ed68fe6313c695ed093c0fb8.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/7b/e3/a0/7be3a0d8a2c7b398464b98b9992e3a19.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a3/6a/63/a36a6396bd83c26373a935fbe3cce647.jpg"));
        itemList.add(new customitem("https://cdn.sharechat.com/jaydwarkadhish_349555a5_1594622602201_cmprsd_40.jpg"));
        itemList.add(new customitem("https://live.staticflickr.com/2563/4224233218_620ea323ff_o.jpg"));
        itemList.add(new customitem("https://s3.ap-south-1.amazonaws.com/hsdreams1/pins/2019/01/big/76b0639cae1a22ad85ce1ef2cdfe9118.jpeg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/2f/23/05/2f23054b753904367fa3448bef168387.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a6/3f/99/a63f9910f7fbcb8f1678760974511cd6.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/02/61/92/026192789c8e76c4b097447fdca4d7be.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/14/09/55/140955d8c79f73428855947d108c1fd4.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/1e/d6/3a/1ed63a2e21f6f8d5b5c904b617b6a3a3.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7010172.jpg"));
        itemList.add(new customitem("https://bapasitaramsevatrust.weebly.com/uploads/1/2/0/1/12016769/2054281.jpg?429"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp5835538.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/51pWxviy1YL._SY450_.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/c3/dd/99/c3dd99a3d767a84eb63d43d02a07539a.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/86/85/3d/86853dfaca058547cf8e4623d2938069.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/22-226646_bapa-sitaram-black-and-white.jpg"));
        itemList.add(new customitem("https://1.bp.blogspot.com/-3QELw4ICJZI/XPpgX0SVAgI/AAAAAAAAAf4/niQ4NkDw8ZA4DDu3iCiXS4xMx7KJ25z2QCLcBGAs/s1600/20180129_194626.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/62-625854_ramapir-photo-wallpaper-download-full-hd-khatu-shyam.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ca/d4/7e/cad47e13b255ae043ea4e6403dc29447.jpg"));
        itemList.add(new customitem("https://fsb.zobj.net/crop.php?r=M-wrlx6zLd3Qdj77b8hqU_NmUY8CfOoL_tSlfJWMbN_1XKPLKZcyA-M081L6w6o8PKlwNSpYhwJWL2Yfpo5yQnYzNV5wFoUM2BT6qBOuTCiXFf_cO9B5zK5nnCLCqYHI8l38Xk18eET1r-50"));
        itemList.add(new customitem("https://fsa.zobj.net/crop.php?r=3z3V5MJS48stcn_5mqZsyvsX4cp6c7Ke6tDrU2eIb1fB-t9ysV62bBm4yCXR8Onz44yZoplCz59qVqUoqseflYcNmf4JqI1_pjfzWDwYMemAxT8svVlLGbk7dzDHlIVetVAMk2-4-D60xwvP"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c2/40/b6/c240b62206917c9d50cd61a04abd4d4e.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c0/46/55/c04655c8667e8423d0f172be94c32374.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/145-1457453_baba-ramdev-ji.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/c8/88/14/c8881484b5a1989e735c2cd39103ffd5.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/21/50/0b/21500b3e727fe6f32e4e3235ffaefe9e.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/6f/f0/a3/6ff0a3fec845c80609a636f9dc21b342.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/4565302.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/be/87/73/be87731025bd335a06397285382a8cbb.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/f7/1b/93/f71b9328e2e0bc9949fb5c5a3ebc11a2.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/51/b0/13/51b0130d74241997f4b46b9179bf8fd7.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/c3/22/8d/c3228de56256b87cfd7cf5e6ed625c26.jpg"));
        itemList.add(new customitem("https://www.bhaktiphotos.com/wp-content/uploads/2018/04/Devi-Maa-Kali-Images-Chandika.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/4565288.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/87/74/e9/8774e9873e8f65873c65fe375bea5ced.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/0a/02/0e/0a020e5862d4d9db8d85dc2f7135654c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/d0/1b/fd/d01bfdcaa55a2c67b1e9c71d2de722e2.jpg"));
        itemList.add(new customitem("https://i1.wp.com/hindupad.com/wp-content/uploads/2013/01/lord-shani.jpg?fit=401%2C500&ssl=1"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSjFE8xD6uJfE1gu2QCQLIqnGAQIjs8bWCRlA&usqp=CAU"));
        itemList.add(new customitem("https://cdn.statically.io/img/images.unsplash.com/photo-1546162290-8687d72f3cfd?ixlib=rb-1.2.1&w=1000&q=80"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTeaCSF9eH---6Hu6XfidEWGAutkz3FJhhh6A&usqp=CAU"));
        itemList.add(new customitem("https://lh3.googleusercontent.com/dZSpuNS7M7sVk0gAlQ_14toMjMQbWRpzlNSitXYhV14tq_ASKBsYNV1RLrYF2qffCdE=h1024-no-tmp_laksha_chandi_maha_yagna_umiya_maa_wallpapers_apk_screenshot_7.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/66-665342_meldi-mataji.jpg"));
        itemList.add(new customitem("https://quotes-image.com/assets/upload/quotes/quotes_10975/quotes143_1592412611.jpg"));
        itemList.add(new customitem("https://cdnaws.sharechat.com/1c345219-8214-4dc9-9e8a-3c385cca358a-ee3a2a33-ae2a-461e-b394-eae1e4ef66f2_compressed_40.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/10/d6/ce/10d6cee0949920470c80360280718c9f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ef/94/d1/ef94d133064b49001ce74b91c386f1ae.jpg"));
        itemList.add(new customitem("https://image.winudf.com/v2/image1/Y29tLmtodXNoaS5qYXkuc3dhbWluYXJheWFuLnJpbmd0b25lc19zY3JlZW5fMF8xNTUyMDk3NDk2XzAwNA/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp4541147.jpg"));
        itemList.add(new customitem("https://www.spoakitsolutions.com/blog/wp-content/uploads/2020/03/saibaba-vibuthi.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/3c/8b/58/3c8b58f0995e80dbb5c0f0ea916909bd.jpg"));
        itemList.add(new customitem("https://www.99images.com/photos/religious/shirdi-sai-baba/sm/shirdi-sai-baba-hd-photos-wallpapers-1080p-jtw5.jpg?v=1577311967"));
        itemList.add(new customitem("https://i.pinimg.com/736x/b9/d8/1b/b9d81b06da74c9cf99ab7425d28eb1ae.jpg"));
        itemList.add(new customitem("https://www.hdwallpapers.in/download/god_buddha_4k_5k_hd-1080x1920.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/dd/64/92/dd6492fe75e3430e3feb8fb86e4fe662.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/81jW10gFJKL._SY550_.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/49/40/ae/4940aea3b53121fe038e8b74dd466d12--lord-sai-baba.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/b8/c5/57/b8c557e88eb69f8548c3fde640b14f1a.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/2e/dc/3a/2edc3a7dd3a6f02edf7f950b85f81f3c.jpg"));
        itemList.add(new customitem("https://wallpaper-mania.com/wp-content/uploads/2018/09/High_resolution_wallpaper_background_ID_77701406867.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/91TcK29BFDL._AC_SX522_.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/download-image/14253/945x1260"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/06/shri-hanuman-hd-phone-wallpaper-576x1024.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_vmxoK_0QmHuXDCaoDdGH0FZC4vaLgtOjnw&usqp=CAU"));
        itemList.add(new customitem("https://media1.santabanta.com/full1/Hinduism/Lord%20Hanuman/lord-hanuman-24a.jpg"));
        itemList.add(new customitem("https://www.123mobilewallpapers.com/wp-content/uploads/2015/03/hindu_gods_wallpaper.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/62/6d/97/626d977be1dd836e9babdb90d21984b6.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/248-2483774_shiv-ji-wallpaper-hd-lord-shiva-wild.jpg"));
        itemList.add(new customitem("https://s3.ap-south-1.amazonaws.com/hsdreams1/pins/2019/01/medium/40181e3f0dcf785e2f33f86db490ab11.jpeg"));
        itemList.add(new customitem("https://www.wallsnapy.com/img_gallery/maa-saraswati-images-full-hd-mobile-7859666.png"));
        itemList.add(new customitem("https://www.123mobilewallpapers.com/wp-content/uploads/2015/03/lord_ganesha_picture.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/cb/e6/f9/cbe6f92e424502e0968638d3a866cd2c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ea/fb/54/eafb54da122905a24a80b124986eb290.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1103321.jpg"));
        itemList.add(new customitem("https://cdn.mirchistatus.com/siteuploads/images/images20/9709/thumb/jai-shri-ram-hd-wallpapers_xlrg.jpg?time=1574847758"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1209095.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/37/0b/b0/370bb072a539f65ee41a048e02923ccd.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/photos/religious/god-murugan/god-murugan-latest-hd-photos-wallpapers-1080p-nld0bq.jpg?v=1576486166"));
        itemList.add(new customitem("https://s3.ap-south-1.amazonaws.com/hsdreams1/pins/2019/01/big/cf70edd1e344ef6b00e463e8e79ceb27.jpeg"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/08/lord-shiva-and-shri-ram-hd-phone-wallpaper.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d1/53/06/d15306aed51db2d3344a3c94ce396483.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRu8KOjN8JFMiNFWi0Hz0mZWPlW3L8SUxIHLw&usqp=CAU"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSig0INJNjf6AFToJ3q2LqJB9nIzkKv_9cBgQ&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/564x/3e/a5/64/3ea564429d26d2935ca876f769db12ac.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/80/76/4b/80764b0d3963a84549d321845b4f9669.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/dd/75/29/dd75298e872a282048df217595925724.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcShYP21otglR8Jzvnazad6Ktdb6xqQl5i2jrg&usqp=CAU"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/GalleryImages/22000/WebImages/2020_04_22_001_Nenpur.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/03/cc/2e/03cc2e74840dfc2e1b000520092ac4b7.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/4a/92/23/4a92239114c40c913f3c140a70f8930f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/47/8c/8e/478c8e9ec95a0fb666de8e36f0dae9df.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWWgEPEOusTnPts8XwuSENcdP87DLBl01rfw&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/736x/e8/a0/f9/e8a0f9cfbb31c664ed6848bd917928a2.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp6776956.jpg"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/GalleryImages/21826/WebImages/2020_03_27_001_Nenpur.jpg"));
        itemList.add(new customitem("https://cdngoogle.sharechat.com/1516157427427_3534.jpeg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ce/1c/22/ce1c22a224c20e6985daa5378c42f7f6.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/fb/02/64/fb02645e51d4284faaafcc100d1ceb2b.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhcsRRidyVEvjZFdRPji49LApc4gaPTXVBNA&usqp=CAU"));
        itemList.add(new customitem("https://aksharmandirdarshan.files.wordpress.com/2018/07/akshar-deri.jpg?w=768"));
        itemList.add(new customitem("https://www.123mobilewallpapers.com/wp-content/uploads/2015/03/god_shiva_background.jpg"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/GalleryImages/21902/WebImages/2020_04_07_001_Nenpur.jpg"));
        itemList.add(new customitem("https://www.itl.cat/pngfile/big/303-3030209_wallpaper-god-image-51-images.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/10/2d/90/102d901b06eb2d806198f2ceb6f0f596.gif"));
        itemList.add(new customitem("https://i.pinimg.com/236x/91/80/52/918052d6e254f5029d9c5a43d1ef9a41--shri-hanuman-indian-gods.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/13/aa/b8/13aab8b0dee412c0a857b188f7b97561.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/download-image/12991/845x1126"));
        itemList.add(new customitem("https://i.pinimg.com/564x/5e/d5/50/5ed550b9d183dbd486dde42fcd088569.jpg"));
        itemList.add(new customitem("https://www.bhaktiphotos.com/wp-content/uploads/2018/04/Hindu-God-HD-Photos.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1105028.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d1/53/06/d15306aed51db2d3344a3c94ce396483.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRy9vabcIG9uEC5UTAWSjpPuhXUx_WY2ksStw&usqp=CAU"));
        itemList.add(new customitem("https://myimgstock.com/public/uploads/preview/new-shivling-photo-wallpapers-hd-11609555535pfvmgecmj3.jpg"));
        itemList.add(new customitem("https://cdn.wallpapersafari.com/62/54/gblaWD.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/34/d6/a2/34d6a2a834d8166ea58b96a26d1d3437.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/66-667167_hindu-god-wallpaper-free-download.jpg"));
        itemList.add(new customitem("https://www.bhagwankiphotos.com/wp-content/uploads/2018/12/HD-Hanuman-Ji-Mobile-Wallpaper-Pictures.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/6e/98/db/6e98dbf06121280760967326058feb98.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/photos/religious/maa-durga-devi/maa-durga-devi-hd-photos-wallpapers-1080p-anriq8.jpg?v=1576485852"));
        itemList.add(new customitem("https://www.mwallpapers.com/download-image/11123/471x628"));
        itemList.add(new customitem("https://i.pinimg.com/564x/94/85/12/9485124f3ca8bb2627edee7ee6aff28b.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/362-3620375_lord-shiv-ling-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/17/6f/c6/176fc6eed9787486e1fed5d759c27e70.jpg"));
        itemList.add(new customitem("https://www.wallsnapy.com/img_gallery/indian-god-images-shiva-hd-for-mobile-2765262.png"));
        itemList.add(new customitem("https://oyewallpaper.com/public/uploads/preview/krishna-murti-wallpaper-download-61-11604471475z2hhoxmflu.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqpKhTlbSBViN4wxah4toaNWKFgSrfWxalAg&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/236x/95/0c/d0/950cd0227110f0475af48c858b1f7ac0.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/2f/23/05/2f23054b753904367fa3448bef168387.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/9f/d6/f4/9fd6f47859fcd19f9e6b80114404bd88.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCOXkksIm8aTKs0vgvBvsV-IXN65BKfYz4SQ&usqp=CAU"));
        itemList.add(new customitem("https://4.bp.blogspot.com/-G8Krmblre2A/TbFOIy1VYUI/AAAAAAAAAZ0/It5Eu8_WbMg/s1600/JALARAM.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/bd/da/e7/bddae7b8b067147fdd3112da2c826541.jpg"));
        itemList.add(new customitem("https://hindibate.com/wp/Shri-Krishna-Animated-image-283.png"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c9/11/f3/c911f39248be14a69221324068864e59.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4nnTdNnnShxuRrBASjD-zghtNZ0zzmBfp4g&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/originals/f7/fe/ac/f7feacae10cc1d0a034e57e7298dbff3.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d9/88/fe/d988feba856b4f331b1c908cbdcad792.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/10/13/12/1013122c0c235e49f4ba5553659e5c6c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/6d/51/51/6d51517f506bf6edb26b4e02a322cf6d.jpg"));
        itemList.add(new customitem("https://www.photosbin.com/uploads/jh5a18012020112333.jpg"));
        itemList.add(new customitem("https://www.itl.cat/pngfile/big/74-747486_creative-graphics-lord-ganesha-wallpaper-ganesh-god-3d.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/42-422800_lord-krishna-hd-wallpapers-for-mobile-full-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/06/c2/6d/06c26d5b8fe779c9d0e2777e1a6253cd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/88/cc/29/88cc29805a537a584335bb4b4fee80ed.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/2528489.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/f2/66/91/f2669135d0c68c25ef05865dbb2b0087.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv-fwNs1JGXsIAEV9WBE4pjWg3yncllxjmVg&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/564x/bd/39/37/bd3937adc28c75a053522608aa208e58.jpg"));
        itemList.add(new customitem("https://www.desktopbackground.org/download/540x960/2013/01/14/514418_god-shiva-backside-trishul-hd-wallpapers_1920x1200_h.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/8b/d7/e6/8bd7e6524b8f4ad673dea3463452ea7a.jpg"));
        itemList.add(new customitem("https://www.bhaktiphotos.com/wp-content/uploads/2018/04/Mahadev-Images-Wallpaper-HD-Full-Size.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/71/63/8e/71638efca7c1fa30f4055c472ee56b6c.jpg"));
        itemList.add(new customitem("https://bhartiyemandirsydney.files.wordpress.com/2020/08/ram-sita-painting-hd-wallpapers-free1.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/93/48/b5/9348b51244f16046349e36efd8a332a3.jpg"));
        itemList.add(new customitem("https://cdn.shopify.com/s/files/1/0969/9128/products/Ram_Sita_Marriage_35d9a6bd-4014-4725-bed8-4b5656aaa349.jpg?v=1567245869"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/3184121.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c5/34/1a/c5341a0613140454993578c22772df81.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/e8/cf/fe/e8cffea59352fd6c66fea29a9c8b40d5.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/37/51/ed/3751edfc3b905a590d85944ae20b7261.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/5e/b5/9f/5eb59fbdcedf47e43a559ddb8bedf64f.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/2-21388_lord-shiva-marble-statue-mahadev-wallpapersbyte-com.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a3/3e/bc/a33ebcb78b511c67e939d45b4947c032.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/ef/e9/ac/efe9acff5a82720c50c2c451d010e6a1.jpg"));
        itemList.add(new customitem("https://cdn.exoticindia.com/details-zoom-mobile/sculptures-2016/xg86.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/e9/55/ce/e955cee69425a5d17ed4e7c6d8849132.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/e7/33/52/e73352480cdc575d7b7f0a03021ffd03.jpg"));
        itemList.add(new customitem("https://cdn130.picsart.com/289403698084201.jpg?type=webp&to=min&r=640"));
        itemList.add(new customitem("https://cutewallpaper.org/21/mahadev-wallpaper/Stunning-Mahadev-Wallpaper-images-For-Free-Download-newt.cat.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7271183.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/b1/fa/25/b1fa25883885d316a18af2ea68f4c92e.jpg"));
        itemList.add(new customitem("https://media-cdn.tripadvisor.com/media/photo-s/0e/50/c1/d8/the-photo-of-hanumanji.jpg"));
        itemList.add(new customitem("https://www.desktopbackground.org/download/480x800/2012/07/04/415778_wallpapers-baps-swaminarayan-jul-f-jpg-1920x1080_1920x1080_h.jpg"));
        itemList.add(new customitem("https://www.swaminarayanvadtalgadi.org/wp-content/uploads/2020/09/Hari-Krushna-Maharaj-2020-2.jpg"));
        itemList.add(new customitem("https://www.hindugodwallpaper.com/images/gods/zoom/2232_brahma-vishnu-mahesh-wallpaper-01.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/96/11/e9/9611e94fe0273fffabf813a47801249b.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/9c/21/dd/9c21dd540df0c96d6f0e0f3cdf43eca5.jpg"));
        itemList.add(new customitem("https://akshardham.com/newdelhi/wp-content/uploads/2015/03/bhagwan_swaminarayan.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/30/67/83/306783b322da478ef851fc381fa0bd64--jai.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/128-1284502_lord-vishnu-hd-pictures-good-morning-vishnu-bhagwan.jpg"));
        itemList.add(new customitem("https://www.gujarattourism.com/content/dam/gujrattourism/images/religious-sites/dwarkadhish-temple/gallery/Dwarkadhish%20Temple0.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a2/3a/68/a23a68468f1c9d6fc8100bc26b6a9586.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/98/bc/35/98bc359fa0134541b866a9ca758e6767.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPsNsdIgeoDcBvJOlfYsFtaI46fYjDQ_zhtQ&usqp=CAU"));
        itemList.add(new customitem("https://i.pinimg.com/originals/9d/78/ea/9d78eaf3ca6ba544b8e5264015698776.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/72/34/0b/72340bf8c7ed9171f7eb40c200466ef3.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/4d/80/b7/4d80b71ebc564845c01ad39111b3efa4.jpg"));
        itemList.add(new customitem("https://shivjipics.com/wp-content/uploads/2019/02/Brahma-Vishnu-Mahesh-Image.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/4f/52/9f/4f529fc342c11157ed69eeebbae9479f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c3/04/a6/c304a6a16330e9495a798207238053b9.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/89/dd/37/89dd3780c0332160a6e28929c93926b8.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/202-2026483_lord-vishnu-hd-images-title-lord-vishnu-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/23/1e/02/231e02c9bd5330b330ba7055e332b57b.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/c7/de/2b/c7de2bb3e3991b463e162c10bef9eedc.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/c2/c0/73/c2c07346d0446c03dbeb46937d9513dd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/27/11/e7/2711e7f482151d978a951288b699d0b9.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/fc/1c/a9/fc1ca95bf2ef85eb38bf7adac5ef431c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d0/d5/c7/d0d5c7fa76c977b66c00d269a2c288b5.jpg"));
        itemList.add(new customitem("https://swaminarayanbhagvan.files.wordpress.com/2013/10/hidolezultahari.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/f5/59/34/f55934d781ab9bc70f41b46b0754a77f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/b6/98/fa/b698fa6cceaa1719f17f8a3e61e9d80f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/50/c5/c4/50c5c423fa6e8a9fbbf3fa3c2f493771.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/72/68/44/726844bdaa0ffe5c18feca7572ee18ca.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/343-3431774_free-krishna-hd-wallpapers-god-wallpaper-download-full.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/5f/3f/67/5f3f6738832a98baaa4baeaab8670b6f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/d5/5b/e7/d55be704792bf9159f7cd5ec046eaf9d.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/cc/37/c0/cc37c06f064dd120b28cee868ce48095.jpg"));
        itemList.add(new customitem("https://www.bhagwankiphotos.com/wp-content/uploads/2019/01/Brahma-Bhagwan-Photos.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/98/90/6e/98906edeac3cfca44cead29347929312.jpg"));
        itemList.add(new customitem("https://www.bhagwankiphotos.com/wp-content/uploads/2019/01/Brahma-Vishnu-Mahesh-Dev-Images.jpg"));
        itemList.add(new customitem("https://2.bp.blogspot.com/-cs4AE6gbpUk/WYlNERY7u1I/AAAAAAAACWU/lCcuQDCIMhUHMiOC0wZDJLj_uaaH5kySwCLcBGAs/s1600/%25E0%25AA%25B6%25E0%25AB%258D%25E0%25AA%25B0%25E0%25AB%2580%2B%25E0%25AA%25B8%25E0%25AB%258D%25E0%25AA%25B5%25E0%25AA%25BE%25E0%25AA%25AE%25E0%25AA%25BF%25E0%25AA%25A8%25E0%25AA%25BE%25E0%25AA%25B0%25E0%25AA%25BE%25E0%25AA%25AF%25E0%25AA%25A3%2B%25E0%25AA%25AD%25E0%25AA%2597%25E0%25AA%25B5%25E0%25AA%25BE%25E0%25AA%25A8.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/68/63/a7/6863a79fb91b7a74005f1f479fd15439.jpg"));
        itemList.add(new customitem("https://cdn.hipwallpaper.com/i/22/57/sU6ZrL.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp5375666.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/94/66/25/946625ff7af1b99e4e65de4c741d0dbe.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/90/6c/d7/906cd7a37941c1e1e8073cd6af9cad51.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/82/ee/a5/82eea5823442958d2830cab746a4c680.jpg"));
        itemList.add(new customitem("https://cdn.sharechat.com/%E2%9C%8B%E0%AA%9C%E0%AA%AF%E0%AA%B8%E0%AB%8D%E0%AA%B5%E0%AA%BE%E0%AA%AE%E0%AB%80%E0%AA%A8%E0%AA%BE%E0%AA%B0%E0%AA%BE%E0%AA%AF%E0%AA%A3_a0899985-ad5f-410c-acf3-98785660d16b-f381315a-87c1-4855-90b2-f3c4b866df09_cmprsd_40.jpg"));
        itemList.add(new customitem("https://data.whicdn.com/images/13014581/original.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/16/fe/c8/16fec8f44c83b0a11ce12817a2cadb4f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/c3/9c/1a/c39c1a21ab4e27ee8c51231e63c57600.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/0c/7e/83/0c7e83583731ef0e23ba16d548c5ce78.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/35/91/c3/3591c3661823634a611a03466f461977.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/183-1830468_mahabharat-lord-krishna-arjun-wallpaper-gopals-sweets-restaurant.jpg"));
        itemList.add(new customitem("https://cdn.pixabay.com/photo/2018/09/15/08/25/ganesh-3678867__340.png"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7010241.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/download-image/16931/511x682"));
        itemList.add(new customitem("https://play-lh.googleusercontent.com/NgZeqXIzmUcioaq9gVIBHySNPQyj4KCh4coYiRvgOrSVCK8KScSTf9KwYkIvDfXfZfQ6"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ee/b4/10/eeb41014f6f322afb035ed688d251d4e.jpg"));
        itemList.add(new customitem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjVg_b14z27Bhfhyq8QD2MTb-vZyrwl7JOgg&usqp=CAU"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1718442.jpg"));
        itemList.add(new customitem("https://i0.wp.com/rkalert.in/wp-content/uploads/2020/08/ganesh-hd-wallpapers-1080p-for-mobile.jpg?resize=400%2C533&is-pending-load=1"));
        itemList.add(new customitem("https://i.pinimg.com/originals/38/23/1c/38231c77f7c1a1258b6cc25da4c1bb8b.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/6f/19/be/6f19befd954434e4365acb9cbcb3b22d.jpg"));
        itemList.add(new customitem("https://www.bhagwanphoto.com/wp-content/uploads/2020/04/Shivshakti-HD-Photos-White-Background.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/36/6f/de/366fde130c9e4fd67f17a68519288c82.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp7010178.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/5d/0f/46/5d0f46b4ea5716743ea5fd140c54cfe0.jpg"));
        itemList.add(new customitem("https://i.dlpng.com/static/png/373847_preview.png"));
        itemList.add(new customitem("https://i.pinimg.com/originals/e3/b2/05/e3b205776c115ef9918040b8bbaadeef.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c0/64/b8/c064b815559b8d3531a4379f014f63ee.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/2c/75/ea/2c75eae96cd505e0eb35d690b0eff7d1.jpg"));
        itemList.add(new customitem("https://www.itl.cat/pngfile/big/158-1582619_alvandar-srinivasan-lord-krishna-bhagavad-gita.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/c3/9c/1a/c39c1a21ab4e27ee8c51231e63c57600.jpg"));
        itemList.add(new customitem("https://fsa.zobj.net/crop.php?r=56a4NhXMTnro_DqyLB930pD4oMMXf4SSq-xC16Frr_JI4KdQkTr4D-0ZpEbbbDbQMAHzSLCkfa0s9RNFX37tSyRkCqi1yK3QbvSQIGMNX26om5n1J4iUarQFK2bS_1ZuFdC7gVjtJ7aJ9HHQ"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/51K%2BurpQSWL.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/474x/be/87/73/be87731025bd335a06397285382a8cbb.jpg"));
        itemList.add(new customitem("https://www.hindisoch.com/wp-content/uploads/2016/08/Govind-Krishna-Wallpapers-Download.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/19/91/cb/1991cb066939149a41480f60fa3a5078.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/bf/30/99/bf3099693802b2d2eafc7dfd35a3f3fe.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/81tABpLHQ5L._SL1401_.jpg"));
        itemList.add(new customitem("https://fsa.zobj.net/crop.php?r=9srmAwJhc0Z3Vid9CmC5kcE7mpP8l1hz-DFVCv7Rm6dbcb6hKfsJBbB3rLqe-4PlYaiL6CRhGvVaxTbRmwdi895EHK5Us1IbZywmU2JwZLrPptyKliXQbX24kQLXHJbCz4TXwHgpN-ih1sHa"));
        itemList.add(new customitem("https://i.pinimg.com/originals/43/7e/38/437e3835edb6ffa16e48c7b05e89f7d6.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/b8/f5/61/b8f5619af50755ca96bfd0c9fd8cebb3.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/81LWxGLrWKL._SL1335_.jpg"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/10/lord-hanuman-wallpaper-for-iphone.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/236x/e5/37/59/e53759a34e25092d103767ced8fb6aa8.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/08/25/af/0825af37db0674b40e9a95ae05debe42.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/dd/64/92/dd6492fe75e3430e3feb8fb86e4fe662.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/46/35/0a/46350aeb4ab47aafc91a5557c76405e6.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp6946742.jpg"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/81M-wLvOENL._SY450_.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/df/2b/2e/df2b2e4aa656e13919447f3a3d06d4d0.png"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp4605593.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/32/08/0f/32080febb0cf3f91bb37fa5a93cedd97.jpg"));
        itemList.add(new customitem("https://64.media.tumblr.com/09555aee4c5502d357261d90674424ba/tumblr_omy0y6esHQ1ru322to1_1280.jpg"));
        itemList.add(new customitem("https://image.winudf.com/v2/image/Y29tLnRhYmtlZXkuZHVyZ2FtYWFoZHdhbGxwYXBlcnNfc2NyZWVuXzBfMTUxODYyNjMxNV8wNDg/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemList.add(new customitem("https://lh3.googleusercontent.com/proxy/5uPoli5XT8elvbwg_iQCkLHYOfA80ND5WlqptqR33dfzgL6pnR8lm5-GAayloKZZtHJu7hiN-bX4x_lKwFckCPSNdpwEGHTZDSEwAZ-3PTQvrFntiib7Ms4BX2JDvprmYowPur1SI1ZgTuo"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/160-1608629_shani-dev-hd-wallpaper-3d-hd-png-download.png"));
        itemList.add(new customitem("https://images-na.ssl-images-amazon.com/images/I/81AP5D8PquL._SL1335_.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c2/e2/9c/c2e29cd5ab081fccc95178672a306785.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/29/81/b4/2981b4c464a67761cc7646612184b536.png"));
        itemList.add(new customitem("https://i.pinimg.com/474x/7d/93/be/7d93be7c862d48a53cefa291c8a49412.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/17/02/5f/17025f39d879265689bfbc2c43ac4f62.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/cc/88/af/cc88af05e078abd530831a46113a1211.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/5d/0a/05/5d0a05fd1aff1d3e61ff45748aa2ad7c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/97/27/7d/97277d6c3077e0fc66404d0cac73a99e.jpg"));
        itemList.add(new customitem("https://n4.sdlcdn.com/imgs/g/k/q/MAHALAXMI-ART-CRAFT-laxmi-vishnu-SDL188044429-1-269ea.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/NAK8rIM.jpg"));
        itemList.add(new customitem("https://upload.wikimedia.org/wikipedia/commons/8/8f/Khodiyarmataji.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/2b/ad/87/2bad8750b5722979e26a4e4077e97bb7.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/7-77580_1080p-murugan-images-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/c5/6f/96/c56f966f1d666fd08e818ea9db4162c7.jpg"));
        itemList.add(new customitem("https://s1.dmcdn.net/v/9vgsa1Llx0XU4L3aD/x1080"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/1103335.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/49/d3/fc/49d3fcd74bdc27fbcf830face8d3b49c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/94/d5/61/94d5614a58819aa60d97972ea568d4eb.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ad/4c/02/ad4c02f4b76fdcfb885bb911d697a84d.jpg"));
        itemList.add(new customitem("https://www.picclickimg.com/d/l400/pict/282975485812_/Vahanvati-Sikotar-Maa-Hindu-Goddess-Gujarat-POSTER.jpg"));
        itemList.add(new customitem("https://www.wallpapertip.com/wmimgs/52-524400_god-murugan-latest-hd-photos-wallpapers-14303-thiruchendur.png"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/09/lord-krishna-statue-hd-phone-wallpaper.jpg"));
        itemList.add(new customitem("https://1.bp.blogspot.com/_tWtGNWVDlTE/SmdpRnk53_I/AAAAAAAADLg/olfntl11Urk/s400/goddess-dasa-ma-with-camel.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/6f/85/de/6f85debbdd49ff69a0b0f680ba82d810.jpg"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/09/lord-krishna-with-flute-soothing-phone-wallpaper.jpg"));
        itemList.add(new customitem("https://www.itl.cat/pngfile/big/4-46584_shiva-images-hd-black-and-white-shiv.jpg"));
        itemList.add(new customitem("https://www.teahub.io/photos/full/300-3000546_baps-swaminarayan-photo-hd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/ef/e0/a7/efe0a76493767e016b72d95205463560.jpg"));
        itemList.add(new customitem("https://lh3.googleusercontent.com/proxy/Z710l4BijkcqhAUrdmVcqYkxpoy-fd36kYZVYDiuXyrpVPUnoVeePwbWpBzOKvSmDyvqK1UFmYVWQRzPYXBgFWDbZi2w9DnMhlrBkGBx-lFdA3Isl-uOWFCaSuPKHbRlBWCOCSYJpAR4vskqENrL1Kqpq_AF0ZaaO5HTgvQeq4s"));
        itemList.add(new customitem("https://londonmandir.baps.org/images/2018/09/all-in-one-murti-NEW.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp4051561.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/38/67/8b/38678b36dbb6539dc4c66544615cc171.jpg"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2020/10/lord-shiva-orange-dusk-hd-phone-wallpaper.jpg"));
        itemList.add(new customitem("https://i0.wp.com/www.wordzz.com/wp-content/uploads/2017/04/lord-krishna-1024x768.jpg?resize=1024%2C768&ssl=1"));
        itemList.add(new customitem("https://1.bp.blogspot.com/-4s81xUwBIn0/W1S0lmjaCSI/AAAAAAAAALg/jszGnBKoAnM7M8RcOcyIPQCAML4mKr0BwCEwYBhgL/s1600/b73b5debec91f0c24e7536a5b6d9e7f8--durga-puja-maa.jpg"));
        itemList.add(new customitem("https://www.krishna-images.com/wp-content/uploads/2020/01/Swaminarayan-Photo-HD-Wallpaper-Download.jpg"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/GalleryImages/11188/WebImages/2015_12_07_005_Sarangpur_f.jpg"));
        itemList.add(new customitem("https://cdna.artstation.com/p/assets/images/images/017/143/186/large/pushkar-chatterjee-s-ld.jpg?1554810248"));
        itemList.add(new customitem("https://i.pinimg.com/originals/7e/ae/ac/7eaeacefcfa29990ce2cd009f381d501.jpg"));
        itemList.add(new customitem("https://fsa.zobj.net/crop.php?r=6eLWvXIJ6IO1gjn41IOTahJADT79yKw0eTkCMs1M77Cb1KVV-pb-BUFfgripKzhd97P8YmdCV0gssq8ZrLz9UNqGECBqts1e4RNtaDB7Fg9esdlZBRoMt_V9LfI7WKwAfTw2goAa_1cIn4X_"));
        itemList.add(new customitem("https://i.pinimg.com/originals/93/d2/60/93d260cb81936588e4e0d5df4f3d57d9.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/7a/96/fd/7a96fd392860125390e3542733b645f0.jpg"));
        itemList.add(new customitem("https://wallpaperaccess.com/full/3529542.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/1f/14/eb/1f14ebdac6add85a94617b431f2cdf15.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/5e/d0/82/5ed0826b731997c8bacb5451bfbdb635.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/65/11/39/651139835ed3e8160f1295a4671c58c0.jpg"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/GalleryImages/6846/WebImages/13_06_26_007f.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/5f/f2/e4/5ff2e4ec57df902b9a9515254a210a74.jpg"));
        itemList.add(new customitem("https://cdn.wrytin.com/images/wrytup/r/1024/10-jv45fp9b.jpeg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/4d/52/c5/4d52c5f494a6e7a6bc3d6c5ad2b3a31b.png"));
        itemList.add(new customitem("https://www.mwallpapers.com/download-image/8760/450x600"));
        itemList.add(new customitem("https://ghantee.com/wp-content/uploads/2019/02/deon-ke-dev-mahadev.jpg"));
        itemList.add(new customitem("https://c4.wallpaperflare.com/wallpaper/70/191/778/shree-krishna-krishna-hindu-hinduism-wallpaper-preview.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/74/14/96/741496177363a1a1a4c2b4e294f89cf8.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/564x/e7/60/52/e76052c307a091cc98e84e78f015e275.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/b8/b8/9c/b8b89c950d65b75d35a56dadffa9033c.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/cf/8d/91/cf8d916db4d950dadf7bdb2fb02af6cd.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/7b/74/c3/7b74c32be5913f99382fdcfe3792fd0d.png"));
        itemList.add(new customitem("https://www.swaminarayan.org/vicharan/2011/04/01/photo/sarangpur/jesal_20110413_sarangpur_143f.jpg"));
        itemList.add(new customitem("https://www.mwallpapers.com/photos/religious/maa-durga-devi/maa-durga-devi-hd-photos-wallpapers-1080p-gz6ley.jpg?v=1576485852"));
        itemList.add(new customitem("https://i.pinimg.com/736x/f9/53/64/f953648845edbb9cbca5dd4985c41001.jpg"));
        itemList.add(new customitem("https://ih1.redbubble.net/image.726623461.4740/flat,750x1000,075,f.jpg"));
        itemList.add(new customitem("https://www.baps.org/Data/Sites/1/Media/DailyMurtiDarshan/892/2018/20180401B.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/24/3f/10/243f10ef5d7ab62af282d654de1729cf.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/a5/e8/43/a5e843e941dbcaee683126b54fff66da.jpg"));
        itemList.add(new customitem("https://wallpapercave.com/wp/wp4749493.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/736x/a6/74/5a/a6745a6287478300cfaa9bf26c98f6ec.jpg"));
        itemList.add(new customitem("https://i.pinimg.com/originals/6a/c3/5e/6ac35eba26ea0e3a7312f973b0c6fda2.png"));
        itemList.add(new customitem("https://www.hindisoch.com/wp-content/uploads/2016/11/Lord-Shiva-Best-HD-Photos-Beautiful-Om-Shivaye-Ji.jpg"));
       

        recycleViewAdapter = new RecycleViewAdapter(itemList,this);
        recyclerView.setAdapter(recycleViewAdapter);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }


            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }

}