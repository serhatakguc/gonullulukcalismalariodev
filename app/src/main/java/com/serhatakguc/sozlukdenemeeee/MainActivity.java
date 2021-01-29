package com.serhatakguc.sozlukdenemeeee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static com.serhatakguc.sozlukdenemeeee.R.*;

public class MainActivity extends AppCompatActivity {

    ImageView resim;
    EditText arama;
    TextView aciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

         arama = findViewById(id.arama);
         resim= findViewById(id.resim);
         aciklama=findViewById(id.aciklama);

    }

    public void bul(View view){


        String kelimem = arama.getText().toString();
        if (kelimem.equalsIgnoreCase("abi")){
            resim.setImageResource(R.drawable.abi);
        }
        if (kelimem.equalsIgnoreCase("abla")){
            resim.setImageResource(drawable.abla);
        }
        if (kelimem.equalsIgnoreCase("acaba")){
            resim.setImageResource(drawable.acaba);
        }
        if (kelimem.equalsIgnoreCase("acı")){
            resim.setImageResource(drawable.aci);
        }
        if (kelimem.equalsIgnoreCase("acıkmak")){
            resim.setImageResource(drawable.acikmak);
        }
        if (kelimem.equalsIgnoreCase("açmak")){
            resim.setImageResource(drawable.acmak);
        }
        if (kelimem.equalsIgnoreCase("adam")){
            resim.setImageResource(R.drawable.adam);
        }
        if (kelimem.equalsIgnoreCase("adres")){
            resim.setImageResource(drawable.adres);
        }
        if (kelimem.equalsIgnoreCase("affetmek")){
            resim.setImageResource(drawable.affetmek);
        }
        if (kelimem.equalsIgnoreCase("ağaç")){
            resim.setImageResource(drawable.agac);
        }
        if (kelimem.equalsIgnoreCase("ağır")){
            resim.setImageResource(drawable.agir);
        }
        if (kelimem.equalsIgnoreCase("aile")){
            resim.setImageResource(drawable.aile);
        }
        if (kelimem.equalsIgnoreCase("akıl")){
            resim.setImageResource(drawable.akil);
        }
        if (kelimem.equalsIgnoreCase("akşam")){
            resim.setImageResource(drawable.aksam);
        }
        if (kelimem.equalsIgnoreCase("alışveriş")){
            resim.setImageResource(drawable.alisveris);
        }
        if (kelimem.equalsIgnoreCase("almak")){
            resim.setImageResource(drawable.almak);
        }
        if (kelimem.equalsIgnoreCase("anne")){
            resim.setImageResource(drawable.anne);
        }
        if (kelimem.equalsIgnoreCase("aramak")){
            resim.setImageResource(drawable.aramak);
        }
        if (kelimem.equalsIgnoreCase("arkadaş")){
            resim.setImageResource(drawable.arkadas);
        }
        if (kelimem.equalsIgnoreCase("ayakkabı")){
            resim.setImageResource(drawable.ayakkabi);
        }
        if (kelimem.equalsIgnoreCase("baba")){
            resim.setImageResource(drawable.baba);
        }
        if (kelimem.equalsIgnoreCase("bağırmak")){
            resim.setImageResource(drawable.bagirmak);
        }
        if (kelimem.equalsIgnoreCase("bağlamak")){
            resim.setImageResource(drawable.baglamak);
        }
        if (kelimem.equalsIgnoreCase("bakmak")){
            resim.setImageResource(drawable.bakmak);
        }
        if (kelimem.equalsIgnoreCase("banane")){
            resim.setImageResource(drawable.banane);
        }
        if (kelimem.equalsIgnoreCase("banyo")){
            resim.setImageResource(drawable.banyo);
        }
        if (kelimem.equalsIgnoreCase("bardak")){
            resim.setImageResource(drawable.bardak);
        }
        if (kelimem.equalsIgnoreCase("barışmak")){
            resim.setImageResource(drawable.barismak);
        }
        if (kelimem.equalsIgnoreCase("başı ağrımak") ||kelimem.equalsIgnoreCase("başıağrımak") ){
            resim.setImageResource(drawable.basiagrimak);
        }
        if (kelimem.equalsIgnoreCase("basketbol")){
            resim.setImageResource(drawable.basketbol);
        }
        if (kelimem.equalsIgnoreCase("baslamak")){
            resim.setImageResource(drawable.baslamak);
        }
        if (kelimem.equalsIgnoreCase("basmak")){
            resim.setImageResource(drawable.basmak);
        }
        if (kelimem.equalsIgnoreCase("bayılmak")){
            resim.setImageResource(drawable.bayilmak);
        }
        if (kelimem.equalsIgnoreCase("bazen")){
            resim.setImageResource(drawable.bazen);
        }
        if (kelimem.equalsIgnoreCase("beğenmek")){
            resim.setImageResource(drawable.begenmke);
        }
        if (kelimem.equalsIgnoreCase("beklemek")){
            resim.setImageResource(drawable.beklemek);
        }
        if (kelimem.equalsIgnoreCase("benim")){
            resim.setImageResource(drawable.benim);
        }
        if (kelimem.equalsIgnoreCase("beraber")){
            resim.setImageResource(drawable.beraber);
        }
        if (kelimem.equalsIgnoreCase("bilgi")){
            resim.setImageResource(drawable.bilgi);
        }
        if (kelimem.equalsIgnoreCase("bilmek")){
            resim.setImageResource(drawable.bilmek);
        }
        if (kelimem.equalsIgnoreCase("binmek")){
            resim.setImageResource(drawable.binmek);
        }
        if (kelimem.equalsIgnoreCase("borç almak")){
            resim.setImageResource(drawable.borcalmak);
        }
        if (kelimem.equalsIgnoreCase("bozmak")){
            resim.setImageResource(drawable.bozmak);
        }
        if (kelimem.equalsIgnoreCase("bulmak")){
            resim.setImageResource(drawable.bulmak);
        }
        if (kelimem.equalsIgnoreCase("cabuk")){
            resim.setImageResource(drawable.cabuk);
        }
        if (kelimem.equalsIgnoreCase("cahil")){
            resim.setImageResource(drawable.cahil);
        }
        if (kelimem.equalsIgnoreCase("calışmak")){
            resim.setImageResource(drawable.calismak);
        }
        if (kelimem.equalsIgnoreCase("çamaşır")){
            resim.setImageResource(drawable.camasir);
        }
        if (kelimem.equalsIgnoreCase("can")){
            resim.setImageResource(drawable.can);
        }
        if (kelimem.equalsIgnoreCase("canı çekmek")){
            resim.setImageResource(drawable.canicekmek);
        }
        if (kelimem.equalsIgnoreCase("canlı")){
            resim.setImageResource(drawable.canli);
        }
        if (kelimem.equalsIgnoreCase("çarpışma")){
            resim.setImageResource(drawable.carpisma);
        }
        if (kelimem.equalsIgnoreCase("çarpma")){
            resim.setImageResource(drawable.carpma);
        }
        if (kelimem.equalsIgnoreCase("çarşaf")){
            resim.setImageResource(drawable.carsaf);
        }
        if (kelimem.equalsIgnoreCase("çarşı")){
            resim.setImageResource(drawable.carsi);
        }
        if (kelimem.equalsIgnoreCase("çay")){
            resim.setImageResource(drawable.cay);
        }
        if (kelimem.equalsIgnoreCase("çaydanlık")){
            resim.setImageResource(drawable.caydanlik);
        }
        if (kelimem.equalsIgnoreCase("ceket")){
            resim.setImageResource(drawable.ceket);
        }
        if (kelimem.equalsIgnoreCase("çekmek")){
            resim.setImageResource(drawable.cekmek);
        }
        if (kelimem.equalsIgnoreCase("çember")){
            resim.setImageResource(drawable.cember);
        }
        if (kelimem.equalsIgnoreCase("cennet")){
            resim.setImageResource(drawable.cennet);
        }
        if (kelimem.equalsIgnoreCase("cesaret")){
            resim.setImageResource(drawable.cesaret);
        }
        if (kelimem.equalsIgnoreCase("çeşit")){
            resim.setImageResource(drawable.cesit);
        }
        if (kelimem.equalsIgnoreCase("cevap")){
            resim.setImageResource(drawable.cevap);
        }
        if (kelimem.equalsIgnoreCase("çevirmek")){
            resim.setImageResource(drawable.cevirmek);
        }
        if (kelimem.equalsIgnoreCase("çevre")){
            resim.setImageResource(drawable.cevre);
        }
        if (kelimem.equalsIgnoreCase("ceza")){
            resim.setImageResource(drawable.ceza);
        }
        if (kelimem.equalsIgnoreCase("çiçek")){
            resim.setImageResource(drawable.cicek);
        }
        if (kelimem.equalsIgnoreCase("ciddi")){
            resim.setImageResource(drawable.ciddi);
        }
        if (kelimem.equalsIgnoreCase("çiftçi")){
            resim.setImageResource(drawable.ciftci);
        }
        if (kelimem.equalsIgnoreCase("çiğ köfte")){
            resim.setImageResource(drawable.cigkofte);
        }
        if (kelimem.equalsIgnoreCase("çiğnemek")){
            resim.setImageResource(drawable.cignemek);
        }
        if (kelimem.equalsIgnoreCase("çıkarma")){
            resim.setImageResource(drawable.cikarma);
        }
        if (kelimem.equalsIgnoreCase("çıkmak")){
            resim.setImageResource(drawable.cikmak);
        }
        if (kelimem.equalsIgnoreCase("çikolata")){
            resim.setImageResource(drawable.cikolata);
        }
        if (kelimem.equalsIgnoreCase("çile")){
            resim.setImageResource(drawable.cile);
        }
        if (kelimem.equalsIgnoreCase("çilek")){
            resim.setImageResource(drawable.cilek);
        }
        if (kelimem.equalsIgnoreCase("çimen")){
            resim.setImageResource(drawable.cimen);
        }
        if (kelimem.equalsIgnoreCase("çimento")){
            resim.setImageResource(drawable.cimento);
        }
        if (kelimem.equalsIgnoreCase("çıplak")){
            resim.setImageResource(drawable.ciplak);
        }
        if (kelimem.equalsIgnoreCase("çırak")){
            resim.setImageResource(drawable.cirak);
        }
        if (kelimem.equalsIgnoreCase("çirkin")){
            resim.setImageResource(drawable.cirkin);
        }
        if (kelimem.equalsIgnoreCase("çizgi")){
            resim.setImageResource(drawable.cizgi);
        }
        if (kelimem.equalsIgnoreCase("çizme")){
            resim.setImageResource(drawable.cizme);
        }
        if (kelimem.equalsIgnoreCase("çoban")){
            resim.setImageResource(drawable.coban);
        }
        if (kelimem.equalsIgnoreCase("çocuk")){
            resim.setImageResource(drawable.cocuk);
        }
        if (kelimem.equalsIgnoreCase("coğrafya")){
            resim.setImageResource(drawable.cografya);
        }
        if (kelimem.equalsIgnoreCase("çok")){
            resim.setImageResource(drawable.cok);
        }
        if (kelimem.equalsIgnoreCase("çömelmek")){
            resim.setImageResource(drawable.comelmek);
        }
        if (kelimem.equalsIgnoreCase("çöp")){
            resim.setImageResource(drawable.cop);
        }
        if (kelimem.equalsIgnoreCase("çorap")){
            resim.setImageResource(drawable.corap);
        }
        if (kelimem.equalsIgnoreCase("çorba")){
            resim.setImageResource(drawable.corba);
        }
        if (kelimem.equalsIgnoreCase("çorum")){
            resim.setImageResource(drawable.corum);
        }
        if (kelimem.equalsIgnoreCase("çukur")){
            resim.setImageResource(drawable.cukur);
        }
        if (kelimem.equalsIgnoreCase("cümle")){
            resim.setImageResource(drawable.cumle);
        }
        if (kelimem.equalsIgnoreCase("çuval")){
            resim.setImageResource(drawable.cuval);
        }
        if (kelimem.equalsIgnoreCase("dağ")){
            resim.setImageResource(drawable.dag);
        }
        if (kelimem.equalsIgnoreCase("dakika")){
            resim.setImageResource(drawable.dakika);
        }
        if (kelimem.equalsIgnoreCase("dalga")){
            resim.setImageResource(drawable.dalga);
        }
        if (kelimem.equalsIgnoreCase("dama")){
            resim.setImageResource(drawable.dama);
        }
        if (kelimem.equalsIgnoreCase("damar")){
            resim.setImageResource(drawable.damar);
        }
        if (kelimem.equalsIgnoreCase("damat")){
            resim.setImageResource(drawable.damat);
        }
        if (kelimem.equalsIgnoreCase("damga")){
            resim.setImageResource(drawable.damga);
        }
        if (kelimem.equalsIgnoreCase("damak")){
            resim.setImageResource(drawable.damka);
        }
        if (kelimem.equalsIgnoreCase("dana")){
            resim.setImageResource(drawable.dana);
        }
        if (kelimem.equalsIgnoreCase("danışma")){
            resim.setImageResource(drawable.danisma);
        }
        if (kelimem.equalsIgnoreCase("dans")){
            resim.setImageResource(drawable.dans);
        }
        if (kelimem.equalsIgnoreCase("dar")){
            resim.setImageResource(drawable.dar);
        }
        if (kelimem.equalsIgnoreCase("dargın")){
            resim.setImageResource(drawable.dargin);
        }
        if (kelimem.equalsIgnoreCase("davet")){
            resim.setImageResource(drawable.davet);
        }
        if (kelimem.equalsIgnoreCase("davranış")){
            resim.setImageResource(drawable.davranis);
        }
        if (kelimem.equalsIgnoreCase("dayı")){
            resim.setImageResource(drawable.dayi);
        }
        if (kelimem.equalsIgnoreCase("dede")){
            resim.setImageResource(drawable.dede);
        }
        if (kelimem.equalsIgnoreCase("dedikodu")){
            resim.setImageResource(drawable.dedikodu);
        }
        if (kelimem.equalsIgnoreCase("defter")){
            resim.setImageResource(drawable.defter);
        }
        if (kelimem.equalsIgnoreCase("değil")){
            resim.setImageResource(drawable.degil);
        }
        if (kelimem.equalsIgnoreCase("değiştirmek")){
            resim.setImageResource(drawable.degistirmek);
        }
        if (kelimem.equalsIgnoreCase("delikanlı")){
            resim.setImageResource(drawable.delikanli);
        }
        if (kelimem.equalsIgnoreCase("demir")){
            resim.setImageResource(drawable.demir);
        }
        if (kelimem.equalsIgnoreCase("demir yolu")){
            resim.setImageResource(drawable.demiryolu);
        }
        if (kelimem.equalsIgnoreCase("deneme")){
            resim.setImageResource(drawable.deneme);
        }
        if (kelimem.equalsIgnoreCase("deniz")){
            resim.setImageResource(drawable.deniz);
        }
        if (kelimem.equalsIgnoreCase("deprem")){
            resim.setImageResource(drawable.deprem);
        }
        if (kelimem.equalsIgnoreCase("derece")){
            resim.setImageResource(drawable.derece);
        }
        if (kelimem.equalsIgnoreCase("deri")){
            resim.setImageResource(drawable.deri);
        }
        if (kelimem.equalsIgnoreCase("ders")){
            resim.setImageResource(drawable.ders);
        }
        if (kelimem.equalsIgnoreCase("dershane")){
            resim.setImageResource(drawable.dershane);
        }
        if (kelimem.equalsIgnoreCase("devlet")){
            resim.setImageResource(drawable.devlet);
        }
        if (kelimem.equalsIgnoreCase("devam")){
            resim.setImageResource(drawable.devam);
        }
        if (kelimem.equalsIgnoreCase("destek")){
            resim.setImageResource(drawable.destek);
        }
        if (kelimem.equalsIgnoreCase("dikkat")){
            resim.setImageResource(drawable.dikkat);
        }
        if (kelimem.equalsIgnoreCase("dilekçe")){
            resim.setImageResource(drawable.dilekce);
        }
        if (kelimem.equalsIgnoreCase("dilenci")){
            resim.setImageResource(drawable.dilenci);
        }
        if (kelimem.equalsIgnoreCase("din")){
            resim.setImageResource(drawable.din);
        }
        if (kelimem.equalsIgnoreCase("dinlenmek")){
            resim.setImageResource(drawable.dinlenmek);
        }
        if (kelimem.equalsIgnoreCase("diploma")){
            resim.setImageResource(drawable.diploma);
        }
        if (kelimem.equalsIgnoreCase("direnmek")){
            resim.setImageResource(drawable.direnmek);
        }
        if (kelimem.equalsIgnoreCase("dirsek")){
            resim.setImageResource(drawable.dirsek);
        }
        if (kelimem.equalsIgnoreCase("disiplin")){
            resim.setImageResource(drawable.disiplin);
        }
        if (kelimem.equalsIgnoreCase("doğal")){
            resim.setImageResource(drawable.dogal);
        }
        if (kelimem.equalsIgnoreCase("doğru")){
            resim.setImageResource(drawable.dogru);
        }
        if (kelimem.equalsIgnoreCase("doğum")){
            resim.setImageResource(drawable.dogum);
        }
        if (kelimem.equalsIgnoreCase("dökmek")){
            resim.setImageResource(drawable.dokmek);
        }
        if (kelimem.equalsIgnoreCase("doksan")){
            resim.setImageResource(drawable.doksan);
        }
        if (kelimem.equalsIgnoreCase("doktor")){
            resim.setImageResource(drawable.doktor);
        }
        if (kelimem.equalsIgnoreCase("dolap")){
            resim.setImageResource(drawable.dolap);
        }
        if (kelimem.equalsIgnoreCase("dolar")){
            resim.setImageResource(drawable.dolar);
        }
        if (kelimem.equalsIgnoreCase("dolaşmak")){
            resim.setImageResource(drawable.dolasmak);
        }
        if (kelimem.equalsIgnoreCase("dolu")){
            resim.setImageResource(drawable.dolu);
        }
        if (kelimem.equalsIgnoreCase("domates")){
            resim.setImageResource(drawable.domates);
        }
        if (kelimem.equalsIgnoreCase("dondurma")){
            resim.setImageResource(drawable.dondurma);
        }
        if (kelimem.equalsIgnoreCase("döner")){
            resim.setImageResource(drawable.doner);
        }
        if (kelimem.equalsIgnoreCase("döşek")){
            resim.setImageResource(drawable.dosek);
        }
        if (kelimem.equalsIgnoreCase("dost")){
            resim.setImageResource(drawable.dost);
        }
        if (kelimem.equalsIgnoreCase("dost")){
            resim.setImageResource(drawable.dost);
        }
        if (kelimem.equalsIgnoreCase("dosya")){
            resim.setImageResource(drawable.dosya);
        }
        if (kelimem.equalsIgnoreCase("dövüşmek")){
            resim.setImageResource(drawable.dovusmek);
        }
        if (kelimem.equalsIgnoreCase("doymak")){
            resim.setImageResource(drawable.doymak);
        }
        if (kelimem.equalsIgnoreCase("dua")){
            resim.setImageResource(drawable.dua);
        }
        if (kelimem.equalsIgnoreCase("düğme")){
            resim.setImageResource(drawable.dugme);
        }
        if (kelimem.equalsIgnoreCase("düğün")){
            resim.setImageResource(drawable.dugun);
        }
        if (kelimem.equalsIgnoreCase("dükkan")){
            resim.setImageResource(drawable.dukkan);
        }
        if (kelimem.equalsIgnoreCase("dün")){
            resim.setImageResource(drawable.dun);
        }
        if (kelimem.equalsIgnoreCase("dünya")){
            resim.setImageResource(drawable.dunya);
        }
        if (kelimem.equalsIgnoreCase("durak")){
            resim.setImageResource(drawable.durak);
        }
        if (kelimem.equalsIgnoreCase("dürbün")){
            resim.setImageResource(drawable.durbun);
        }
        if (kelimem.equalsIgnoreCase("durmak")){
            resim.setImageResource(drawable.durmak);
        }
        if (kelimem.equalsIgnoreCase("dürüst")){
            resim.setImageResource(drawable.durust);
        }
        if (kelimem.equalsIgnoreCase("duş")){
            resim.setImageResource(drawable.dus);
        }
        if (kelimem.equalsIgnoreCase("düşman")){
            resim.setImageResource(drawable.dusman);
        }
        if (kelimem.equalsIgnoreCase("duvar")){
            resim.setImageResource(drawable.duvar);
        }
        if (kelimem.equalsIgnoreCase("duymak")){
            resim.setImageResource(drawable.duymak);
        }
        if (kelimem.equalsIgnoreCase("düz")){
            resim.setImageResource(drawable.duz);
        }
        if (kelimem.equalsIgnoreCase("eczane")){
            resim.setImageResource(drawable.eczane);
        }
        if (kelimem.equalsIgnoreCase("edebiyat")){
            resim.setImageResource(drawable.edebiyat);
        }
        if (kelimem.equalsIgnoreCase("efendi")){
            resim.setImageResource(drawable.efendi);
        }
        if (kelimem.equalsIgnoreCase("eğilmek")){
            resim.setImageResource(drawable.egilmek);
        }
        if (kelimem.equalsIgnoreCase("eğitim")){
            resim.setImageResource(drawable.egitim);
        }
        if (kelimem.equalsIgnoreCase("eğlence")){
            resim.setImageResource(drawable.eglence);
        }
        if (kelimem.equalsIgnoreCase("ehliyet")){
            resim.setImageResource(drawable.ehliyet);
        }
        if (kelimem.equalsIgnoreCase("ekim")){
            resim.setImageResource(drawable.ekim);
        }
        if (kelimem.equalsIgnoreCase("eksi")){
            resim.setImageResource(drawable.eksi);
        }
        if (kelimem.equalsIgnoreCase("ekmek")){
            resim.setImageResource(drawable.ekmek);
        }
        if (kelimem.equalsIgnoreCase("ekonomi")){
            resim.setImageResource(drawable.ekonomi);
        }
        if (kelimem.equalsIgnoreCase("ekşi")){
            resim.setImageResource(drawable.ekksi);
        }
        if (kelimem.equalsIgnoreCase("eksik")){
            resim.setImageResource(drawable.eksik);
        }
        if (kelimem.equalsIgnoreCase("el")){
            resim.setImageResource(drawable.el);
        }
        if (kelimem.equalsIgnoreCase("elbise")){
            resim.setImageResource(drawable.elbise);
        }
        if (kelimem.equalsIgnoreCase("eldiven")){
            resim.setImageResource(drawable.eldiven);
        }
        if (kelimem.equalsIgnoreCase("elektrik")){
            resim.setImageResource(drawable.elektrik);
        }
        if (kelimem.equalsIgnoreCase("elemek")){
            resim.setImageResource(drawable.elemek);
        }
        if (kelimem.equalsIgnoreCase("eline sağlık")){
            resim.setImageResource(drawable.elinesaglik);
        }
        if (kelimem.equalsIgnoreCase("elma")){
            resim.setImageResource(drawable.elma);
        }
        if (kelimem.equalsIgnoreCase("emniyet")){
            resim.setImageResource(drawable.emniyet);
        }
        if (kelimem.equalsIgnoreCase("endişe")){
            resim.setImageResource(drawable.endise);
        }
        if (kelimem.equalsIgnoreCase("engel")){
            resim.setImageResource(drawable.engel);
        }
        if (kelimem.equalsIgnoreCase("engelli")){
            resim.setImageResource(drawable.engelli);
        }
        if (kelimem.equalsIgnoreCase("erkek")){
            resim.setImageResource(drawable.erkek);
        }
        if (kelimem.equalsIgnoreCase("eski")){
            resim.setImageResource(drawable.eski);
        }
        if (kelimem.equalsIgnoreCase("eşofman")){
            resim.setImageResource(drawable.esofman);
        }
        if (kelimem.equalsIgnoreCase("eş")){
            resim.setImageResource(drawable.ess);
        }
        if (kelimem.equalsIgnoreCase("eşya")){
            resim.setImageResource(drawable.esya);
        }
        if (kelimem.equalsIgnoreCase("ev")){
            resim.setImageResource(R.drawable.ev);
        }
        if (kelimem.equalsIgnoreCase("evlenmek")){
            resim.setImageResource(drawable.evlenmek);
        }
        if (kelimem.equalsIgnoreCase("evet")){
            resim.setImageResource(drawable.evvet);
        }
        if (kelimem.equalsIgnoreCase("ezberlemek")){
            resim.setImageResource(drawable.ezberlemek);
        }
        if (kelimem.equalsIgnoreCase("fabrika")){
            resim.setImageResource(drawable.fabrika);
        }
        if (kelimem.equalsIgnoreCase("fakir")){
            resim.setImageResource(drawable.fakir);
        }
        if (kelimem.equalsIgnoreCase("fakülte")){
            resim.setImageResource(drawable.fakulte);
        }
        if (kelimem.equalsIgnoreCase("farketmez")){
            resim.setImageResource(drawable.farketmez);
        }
        if (kelimem.equalsIgnoreCase("farklı")){
            resim.setImageResource(drawable.farkli);
        }
        if (kelimem.equalsIgnoreCase("fasülye")){
            resim.setImageResource(drawable.fasulye);
        }
        if (kelimem.equalsIgnoreCase("fatura")){
            resim.setImageResource(drawable.fatura);
        }
        if (kelimem.equalsIgnoreCase("final")){
            resim.setImageResource(drawable.faynil);
        }
        if (kelimem.equalsIgnoreCase("fena")){
            resim.setImageResource(drawable.fena);
        }
        if (kelimem.equalsIgnoreCase("fermuar")){
            resim.setImageResource(drawable.fermuar);
        }
        if (kelimem.equalsIgnoreCase("fıkra")){
            resim.setImageResource(drawable.fikra);
        }
        if (kelimem.equalsIgnoreCase("film")){
            resim.setImageResource(drawable.film);
        }
        if (kelimem.equalsIgnoreCase("fındık")){
            resim.setImageResource(drawable.findik);
        }
        if (kelimem.equalsIgnoreCase("fiş")){
            resim.setImageResource(drawable.fiss);
        }
        if (kelimem.equalsIgnoreCase("fıstık")){
            resim.setImageResource(drawable.fistik);
        }
        if (kelimem.equalsIgnoreCase("fiyat")){
            resim.setImageResource(drawable.fiyat);
        }
        if (kelimem.equalsIgnoreCase("fotoğraf")){
            resim.setImageResource(drawable.fotograf);
        }
        if (kelimem.equalsIgnoreCase("fotokopi")){
            resim.setImageResource(drawable.fotokopi);
        }
        if (kelimem.equalsIgnoreCase("gazete")){
            resim.setImageResource(drawable.gazete);
        }
        if (kelimem.equalsIgnoreCase("gazoz")){
            resim.setImageResource(drawable.gazoz);
        }
        if (kelimem.equalsIgnoreCase("gece")){
            resim.setImageResource(drawable.gece);
        }
        if (kelimem.equalsIgnoreCase("gecikmek")){
            resim.setImageResource(drawable.gecikmek);
        }
        if (kelimem.equalsIgnoreCase("geçmek")){
            resim.setImageResource(drawable.gecmek);
        }
        if (kelimem.equalsIgnoreCase("geçmiş olsun")){
            resim.setImageResource(drawable.gecmisolsun);
        }
        if (kelimem.equalsIgnoreCase("gelişme")){
            resim.setImageResource(drawable.gelisme);
        }
        if (kelimem.equalsIgnoreCase("gelmek")){
            resim.setImageResource(drawable.gelmek);
        }
        if (kelimem.equalsIgnoreCase("gemi")){
            resim.setImageResource(drawable.gemi);
        }
        if (kelimem.equalsIgnoreCase("genç")){
            resim.setImageResource(drawable.genc);
        }
        if (kelimem.equalsIgnoreCase("geniş")){
            resim.setImageResource(drawable.genis);
        }
        if (kelimem.equalsIgnoreCase("gerçek")){
            resim.setImageResource(drawable.gercek);
        }
        if (kelimem.equalsIgnoreCase("geri")){
            resim.setImageResource(drawable.geri);
        }
        if (kelimem.equalsIgnoreCase("getirmek")){
            resim.setImageResource(drawable.getirmek);
        }
        if (kelimem.equalsIgnoreCase("gezmek")){
            resim.setImageResource(drawable.gezmek);
        }
        if (kelimem.equalsIgnoreCase("gibi")){
            resim.setImageResource(drawable.gibi);
        }
        if (kelimem.equalsIgnoreCase("girmek")){
            resim.setImageResource(drawable.girmek);
        }
        if (kelimem.equalsIgnoreCase("giyinmek")){
            resim.setImageResource(drawable.giyinmek);
        }
        if (kelimem.equalsIgnoreCase("göğüs")){
            resim.setImageResource(drawable.gogus);
        }
        if (kelimem.equalsIgnoreCase("göl")){
            resim.setImageResource(drawable.gol);
        }
        if (kelimem.equalsIgnoreCase("gömlek")){
            resim.setImageResource(drawable.gomlek);
        }
        if (kelimem.equalsIgnoreCase("günaydın")){
            resim.setImageResource(drawable.gunaydin);
        }
        if (kelimem.equalsIgnoreCase("gündüz")){
            resim.setImageResource(drawable.gunduz);
        }
        if (kelimem.equalsIgnoreCase("güneş")){
            resim.setImageResource(drawable.gunes);
        }
        if (kelimem.equalsIgnoreCase("güzel")){
            resim.setImageResource(drawable.guzel);
        }
        if (kelimem.equalsIgnoreCase("haber")){
            resim.setImageResource(drawable.haber);
        }
        if (kelimem.equalsIgnoreCase("hafif")){
            resim.setImageResource(drawable.hafif);
        }
        if (kelimem.equalsIgnoreCase("hafta")){
            resim.setImageResource(drawable.hafta);
        }
        if (kelimem.equalsIgnoreCase("hak")){
            resim.setImageResource(drawable.hak);
        }
        if (kelimem.equalsIgnoreCase("halı")){
            resim.setImageResource(drawable.hali);
        }
        if (kelimem.equalsIgnoreCase("halk")){
            resim.setImageResource(drawable.halk);
        }
        if (kelimem.equalsIgnoreCase("hapishane")){
            resim.setImageResource(drawable.hapishane);
        }
        if (kelimem.equalsIgnoreCase("harcamak")){
            resim.setImageResource(drawable.harcamak);
        }
        if (kelimem.equalsIgnoreCase("harita")){
            resim.setImageResource(drawable.harita);
        }
        if (kelimem.equalsIgnoreCase("hasta")){
            resim.setImageResource(drawable.hasta);
        }
        if (kelimem.equalsIgnoreCase("hastane")){
            resim.setImageResource(drawable.hastane);
        }
        if (kelimem.equalsIgnoreCase("hatıra")){
            resim.setImageResource(drawable.hatira);
        }
        if (kelimem.equalsIgnoreCase("hatırlamak")){
            resim.setImageResource(drawable.hatirlamak);
        }
        if (kelimem.equalsIgnoreCase("hava")){
            resim.setImageResource(drawable.hava);
        }
        if (kelimem.equalsIgnoreCase("havalı")){
            resim.setImageResource(drawable.havali);
        }
        if (kelimem.equalsIgnoreCase("hayal")){
            resim.setImageResource(drawable.hayal);
        }
        if (kelimem.equalsIgnoreCase("hayat")){
            resim.setImageResource(drawable.hayat);
        }
        if (kelimem.equalsIgnoreCase("hayır")){
            resim.setImageResource(drawable.hayir);
        }
        if (kelimem.equalsIgnoreCase("hayvan")){
            resim.setImageResource(drawable.hayvan);
        }
        if (kelimem.equalsIgnoreCase("hazırlamak")){
            resim.setImageResource(drawable.hazirlamak);
        }
        if (kelimem.equalsIgnoreCase("hediye")){
            resim.setImageResource(drawable.hediye);
        }
        if (kelimem.equalsIgnoreCase("hemen")){
            resim.setImageResource(drawable.hemen);
        }
        if (kelimem.equalsIgnoreCase("hemşire")){
            resim.setImageResource(drawable.hemsire);
        }
        if (kelimem.equalsIgnoreCase("hepsi")){
            resim.setImageResource(drawable.hepsi);
        }
        if (kelimem.equalsIgnoreCase("hesap")){
            resim.setImageResource(drawable.hesap);
        }
        if (kelimem.equalsIgnoreCase("hiç")){
            resim.setImageResource(drawable.hic);
        }
        if (kelimem.equalsIgnoreCase("hissetmek")){
            resim.setImageResource(drawable.hissetmek);
        }
        if (kelimem.equalsIgnoreCase("hızlı")){
            resim.setImageResource(drawable.hizli);
        }
        if (kelimem.equalsIgnoreCase("hoşbulduk")||kelimem.equalsIgnoreCase("hoş bulduk")){
            resim.setImageResource(drawable.hosbulduk);
        }
        if (kelimem.equalsIgnoreCase("hoşgeldin")||kelimem.equalsIgnoreCase("hoş bulduk")){
            resim.setImageResource(drawable.hosgeldin);
        }
        if (kelimem.equalsIgnoreCase("hoşlanmak")){
            resim.setImageResource(drawable.hoslanmak);
        }
        if (kelimem.equalsIgnoreCase("hukuk")){
            resim.setImageResource(drawable.hukuk);
        }
        if (kelimem.equalsIgnoreCase("huzur")){
            resim.setImageResource(drawable.huzur);
        }
        if (kelimem.equalsIgnoreCase("için")){
            resim.setImageResource(drawable.icin);
        }
        if (kelimem.equalsIgnoreCase("içinde")){
            resim.setImageResource(drawable.icinde);
        }
        if (kelimem.equalsIgnoreCase("içine atmak")){
            resim.setImageResource(drawable.icineatmak);
        }
        if (kelimem.equalsIgnoreCase("içmek")){
            resim.setImageResource(drawable.icmek);
        }
        if (kelimem.equalsIgnoreCase("ifade")){
            resim.setImageResource(drawable.ifade);
        }
        if (kelimem.equalsIgnoreCase("iftira")){
            resim.setImageResource(drawable.iftira);
        }
        if (kelimem.equalsIgnoreCase("iğne")){
            resim.setImageResource(drawable.igne);
        }
        if (kelimem.equalsIgnoreCase("ikinci")){
            resim.setImageResource(drawable.ikinci);
        }
        if (kelimem.equalsIgnoreCase("ilaç")){
            resim.setImageResource(drawable.ilac);
        }
        if (kelimem.equalsIgnoreCase("ileri")){
            resim.setImageResource(drawable.ileri);
        }
        if (kelimem.equalsIgnoreCase("iletişim")){
            resim.setImageResource(drawable.iletisim);
        }
        if (kelimem.equalsIgnoreCase("ilgi")){
            resim.setImageResource(drawable.ilgi);
        }
        if (kelimem.equalsIgnoreCase("ilgilendirmez")){
            resim.setImageResource(drawable.ilgilendirmez);
        }
        if (kelimem.equalsIgnoreCase("ilgilenmek")){
            resim.setImageResource(drawable.ilgilenmek);
        }
        if (kelimem.equalsIgnoreCase("ilginç")){
            resim.setImageResource(drawable.ilginc);
        }
        if (kelimem.equalsIgnoreCase("ilk yardım")){
            resim.setImageResource(drawable.ilkyardim);
        }
        if (kelimem.equalsIgnoreCase("imkansız")){
            resim.setImageResource(drawable.imkansiz);
        }
        if (kelimem.equalsIgnoreCase("imrenmek")){
            resim.setImageResource(drawable.imrenmek);
        }
        if (kelimem.equalsIgnoreCase("imza")){
            resim.setImageResource(drawable.imza);
        }
        if (kelimem.equalsIgnoreCase("inanmak")){
            resim.setImageResource(drawable.inanmak);
        }
        if (kelimem.equalsIgnoreCase("inanmamak")){
            resim.setImageResource(drawable.inanmamak);
        }
        if (kelimem.equalsIgnoreCase("inkar")){
            resim.setImageResource(drawable.inkar);
        }
        if (kelimem.equalsIgnoreCase("inmek")){
            resim.setImageResource(drawable.inmek);
        }
        if (kelimem.equalsIgnoreCase("internet")){
            resim.setImageResource(drawable.internet);
        }
        if (kelimem.equalsIgnoreCase("iptal")){
            resim.setImageResource(drawable.iptal);
        }
        if (kelimem.equalsIgnoreCase("ırmak")){
            resim.setImageResource(drawable.irmak);
        }
        if (kelimem.equalsIgnoreCase("işaret")){
            resim.setImageResource(drawable.isaret);
        }
        if (kelimem.equalsIgnoreCase("isim")){
            resim.setImageResource(drawable.isim);
        }
        if (kelimem.equalsIgnoreCase("ısınmak")){
            resim.setImageResource(drawable.isinmak);
        }
        if (kelimem.equalsIgnoreCase("işitmek")){
            resim.setImageResource(drawable.isitmek);
        }
        if (kelimem.equalsIgnoreCase("ıspanak")){
            resim.setImageResource(drawable.ispanak);
        }
        if (kelimem.equalsIgnoreCase("iş")){
            resim.setImageResource(drawable.iss);
        }
        if (kelimem.equalsIgnoreCase("işçi")){
            resim.setImageResource(drawable.issci);
        }
        if (kelimem.equalsIgnoreCase("istemek")){
            resim.setImageResource(drawable.istemek);
        }
        if (kelimem.equalsIgnoreCase("istifa")){
            resim.setImageResource(drawable.istifa);
        }
        if (kelimem.equalsIgnoreCase("istismar")){
            resim.setImageResource(drawable.istismar);
        }
        if (kelimem.equalsIgnoreCase("isyan")){
            resim.setImageResource(drawable.isyan);
        }
        if (kelimem.equalsIgnoreCase("işyeri")||kelimem.equalsIgnoreCase("iş yeri")){
            resim.setImageResource(drawable.isyeri);
        }
        if (kelimem.equalsIgnoreCase("itfaiye")){
            resim.setImageResource(drawable.itfaiye);
        }
        if (kelimem.equalsIgnoreCase("itiraz")){
            resim.setImageResource(drawable.itiraz);
        }
        if (kelimem.equalsIgnoreCase("itmek")){
            resim.setImageResource(drawable.itmek);
        }
        if (kelimem.equalsIgnoreCase("iyi")){
            resim.setImageResource(drawable.iyi);
        }
        if (kelimem.equalsIgnoreCase("iyi akşamlar")){
            resim.setImageResource(drawable.iyiaksamlar);
        }
        if (kelimem.equalsIgnoreCase("iyi günler")){
            resim.setImageResource(drawable.iyigunler);
        }
        if (kelimem.equalsIgnoreCase("izci")){
            resim.setImageResource(drawable.izci);
        }
        if (kelimem.equalsIgnoreCase("ızgara")){
            resim.setImageResource(drawable.izgara);
        }
        if (kelimem.equalsIgnoreCase("izlemek")){
            resim.setImageResource(drawable.izlemek);
        }
        if (kelimem.equalsIgnoreCase("jandarma")){
            resim.setImageResource(drawable.jandarma);
        }
        if (kelimem.equalsIgnoreCase("jilet")){
            resim.setImageResource(drawable.jilet);
        }
        if (kelimem.equalsIgnoreCase("kabak")){
            resim.setImageResource(drawable.kabak);
        }
        if (kelimem.equalsIgnoreCase("kabul etmek")){
            resim.setImageResource(drawable.kabuletmek);
        }
        if (kelimem.equalsIgnoreCase("kaçmak")){
            resim.setImageResource(drawable.kacmak);
        }
        if (kelimem.equalsIgnoreCase("kadın")){
            resim.setImageResource(drawable.kadin);
        }
        if (kelimem.equalsIgnoreCase("kafaya takmak")){
            resim.setImageResource(drawable.kafayatakmak);
        }
        if (kelimem.equalsIgnoreCase("kağıt")){
            resim.setImageResource(drawable.kagit);
        }
        if (kelimem.equalsIgnoreCase("kahraman")){
            resim.setImageResource(drawable.kahraman);
        }
        if (kelimem.equalsIgnoreCase("kahve")){
            resim.setImageResource(drawable.kahve);
        }
        if (kelimem.equalsIgnoreCase("kalbi kırılmak")){
            resim.setImageResource(drawable.kalbikirilmak);
        }
        if (kelimem.equalsIgnoreCase("kalem")){
            resim.setImageResource(drawable.kalem);
        }
        if (kelimem.equalsIgnoreCase("kalmak")){
            resim.setImageResource(drawable.kalmak);
        }
        if (kelimem.equalsIgnoreCase("kamera")){
            resim.setImageResource(drawable.kamera);
        }
        if (kelimem.equalsIgnoreCase("kapalı")){
            resim.setImageResource(drawable.kapali);
        }
        if (kelimem.equalsIgnoreCase("kapı")){
            resim.setImageResource(drawable.kapi);
        }
        if (kelimem.equalsIgnoreCase("karar")){
            resim.setImageResource(drawable.karar);
        }
        if (kelimem.equalsIgnoreCase("karışık")){
            resim.setImageResource(drawable.karisik);
        }
        if (kelimem.equalsIgnoreCase("karışma")){
            resim.setImageResource(drawable.karisma);
        }
        if (kelimem.equalsIgnoreCase("karşılaşmak")){
            resim.setImageResource(drawable.karsilasmak);
        }
        if (kelimem.equalsIgnoreCase("kavga")){
            resim.setImageResource(drawable.kavga);
        }
        if (kelimem.equalsIgnoreCase("kayıp")){
            resim.setImageResource(drawable.kayip);
        }
        if (kelimem.equalsIgnoreCase("kaza")){
            resim.setImageResource(drawable.kaza);
        }
        if (kelimem.equalsIgnoreCase("kelime")){
            resim.setImageResource(drawable.kelima);
        }
        if (kelimem.equalsIgnoreCase("kendi")){
            resim.setImageResource(drawable.kendi);
        }
        if (kelimem.equalsIgnoreCase("kesin")){
            resim.setImageResource(drawable.kesin);
        }
        if (kelimem.equalsIgnoreCase("keşke")){
            resim.setImageResource(drawable.keske);
        }
        if (kelimem.equalsIgnoreCase("kilit")){
            resim.setImageResource(drawable.kilit);
        }
        if (kelimem.equalsIgnoreCase("kilitlemek")){
            resim.setImageResource(drawable.kilitlemek);
        }
        if (kelimem.equalsIgnoreCase("kırmak")){
            resim.setImageResource(drawable.kirmak);
        }
        if (kelimem.equalsIgnoreCase("kıskanmak")){
            resim.setImageResource(drawable.kiskanmak);
        }
        if (kelimem.equalsIgnoreCase("kitap")){
            resim.setImageResource(drawable.kitap);
        }
        if (kelimem.equalsIgnoreCase("kız")){
            resim.setImageResource(drawable.kiz);
        }
        if (kelimem.equalsIgnoreCase("kızmak")){
            resim.setImageResource(drawable.kizmak);
        }
        if (kelimem.equalsIgnoreCase("koklamak")){
            resim.setImageResource(drawable.koklamak);
        }
        if (kelimem.equalsIgnoreCase("kolay")){
            resim.setImageResource(drawable.kolay);
        }
        if (kelimem.equalsIgnoreCase("komik")){
            resim.setImageResource(drawable.komik);
        }
        if (kelimem.equalsIgnoreCase("komşu")){
            resim.setImageResource(drawable.komsu);
        }
        if (kelimem.equalsIgnoreCase("kontrol")){
            resim.setImageResource(drawable.kontrol);
        }
        if (kelimem.equalsIgnoreCase("konuşmak")){
            resim.setImageResource(drawable.konusmak);
        }
        if (kelimem.equalsIgnoreCase("korkmak")){
            resim.setImageResource(drawable.korkmak);
        }
        if (kelimem.equalsIgnoreCase("koşmak")){
            resim.setImageResource(drawable.kosmak);
        }
        if (kelimem.equalsIgnoreCase("kötü")){
            resim.setImageResource(drawable.kotu);
        }
        if (kelimem.equalsIgnoreCase("kovmak")){
            resim.setImageResource(drawable.kovmak);
        }
        if (kelimem.equalsIgnoreCase("koymak")){
            resim.setImageResource(drawable.koymak);
        }
        if (kelimem.equalsIgnoreCase("kutlamak")){
            resim.setImageResource(drawable.kutlamak);
        }
        if (kelimem.equalsIgnoreCase("laboratuvar")){
            resim.setImageResource(drawable.laboratuvar);
        }
        if (kelimem.equalsIgnoreCase("laf")){
            resim.setImageResource(drawable.laf);
        }
        if (kelimem.equalsIgnoreCase("lazım")){
            resim.setImageResource(drawable.lazim);
        }
        if (kelimem.equalsIgnoreCase("leylek")){
            resim.setImageResource(drawable.leylek);
        }
        if (kelimem.equalsIgnoreCase("lira")){
            resim.setImageResource(drawable.lira);
        }
        if (kelimem.equalsIgnoreCase("lise")){
            resim.setImageResource(drawable.lise);
        }
        if (kelimem.equalsIgnoreCase("lütfen")){
            resim.setImageResource(drawable.lutfen);
        }
        if (kelimem.equalsIgnoreCase("maaş")){
            resim.setImageResource(drawable.maas);
        }
        if (kelimem.equalsIgnoreCase("mağaza")){
            resim.setImageResource(drawable.magaza);
        }
        if (kelimem.equalsIgnoreCase("maske")){
            resim.setImageResource(drawable.maske);
        }
        if (kelimem.equalsIgnoreCase("mecbur")){
            resim.setImageResource(drawable.mecbur);
        }
        if (kelimem.equalsIgnoreCase("memnun olmak")){
            resim.setImageResource(drawable.memnunolmak);
        }
        if (kelimem.equalsIgnoreCase("mendil")){
            resim.setImageResource(drawable.mendil);
        }
        if (kelimem.equalsIgnoreCase("merak")){
            resim.setImageResource(drawable.merak);
        }
        if (kelimem.equalsIgnoreCase("merhaba")){
            resim.setImageResource(drawable.merhaba);
        }
        if (kelimem.equalsIgnoreCase("mesafe")){
            resim.setImageResource(drawable.mesafe);
        }
        if (kelimem.equalsIgnoreCase("mesaj")){
            resim.setImageResource(drawable.mesaj);
        }
        if (kelimem.equalsIgnoreCase("mesela")){
            resim.setImageResource(drawable.mesela);
        }
        if (kelimem.equalsIgnoreCase("misafir")){
            resim.setImageResource(drawable.misafir);
        }
        if (kelimem.equalsIgnoreCase("mont")){
            resim.setImageResource(drawable.mont);
        }
        if (kelimem.equalsIgnoreCase("motor")){
            resim.setImageResource(drawable.motor);
        }
        if (kelimem.equalsIgnoreCase("muayene")){
            resim.setImageResource(drawable.muayene);
        }
        if (kelimem.equalsIgnoreCase("mücadele")){
            resim.setImageResource(drawable.mucadele);
        }
        if (kelimem.equalsIgnoreCase("müjde")){
            resim.setImageResource(drawable.mujde);
        }
        if (kelimem.equalsIgnoreCase("mükemmel")){
            resim.setImageResource(drawable.mukemmel);
        }
        if (kelimem.equalsIgnoreCase("münakaşa")){
            resim.setImageResource(drawable.munakasa);
        }
        if (kelimem.equalsIgnoreCase("müsait")){
            resim.setImageResource(drawable.musait);
        }
        if (kelimem.equalsIgnoreCase("mutfak")){
            resim.setImageResource(drawable.mutfak);
        }
        if (kelimem.equalsIgnoreCase("müzik")){
            resim.setImageResource(drawable.muzik);
        }
        if (kelimem.equalsIgnoreCase("nakil")){
            resim.setImageResource(drawable.naki);
        }
        if (kelimem.equalsIgnoreCase("nasıl")){
            resim.setImageResource(drawable.nasil);
        }
        if (kelimem.equalsIgnoreCase("nasilsin")){
            resim.setImageResource(drawable.nassilsim);
        }
        if (kelimem.equalsIgnoreCase("nazlanmak")){
            resim.setImageResource(drawable.nazlanmak);
        }
        if (kelimem.equalsIgnoreCase("ne")){
            resim.setImageResource(drawable.ne);
        }
        if (kelimem.equalsIgnoreCase("neden")){
            resim.setImageResource(drawable.neden);
        }
        if (kelimem.equalsIgnoreCase("nefret")){
            resim.setImageResource(drawable.nefret);
        }
        if (kelimem.equalsIgnoreCase("nehir")){
            resim.setImageResource(drawable.nehir);
        }
        if (kelimem.equalsIgnoreCase("ne iş yapıyorsun")){
            resim.setImageResource(drawable.neisyapiyorsun);
        }
        if (kelimem.equalsIgnoreCase("nerede")){
            resim.setImageResource(drawable.nerede);
        }
        if (kelimem.equalsIgnoreCase("nereye")){
            resim.setImageResource(drawable.nereye);
        }
        if (kelimem.equalsIgnoreCase("nezle")){
            resim.setImageResource(drawable.nezle);
        }
        if (kelimem.equalsIgnoreCase("niçin")){
            resim.setImageResource(drawable.nicin);
        }
        if (kelimem.equalsIgnoreCase("nöbetçi")){
            resim.setImageResource(drawable.nobetci);
        }
        if (kelimem.equalsIgnoreCase("normal")){
            resim.setImageResource(drawable.normal);
        }
        if (kelimem.equalsIgnoreCase("not")){
            resim.setImageResource(drawable.not);
        }
        if (kelimem.equalsIgnoreCase("nüfus cüzdanı")){
            resim.setImageResource(drawable.nufuscuzdani);
        }
        if (kelimem.equalsIgnoreCase("numara")){
            resim.setImageResource(drawable.numara);
        }
        if (kelimem.equalsIgnoreCase("obur")){
            resim.setImageResource(drawable.obur);
        }
        if (kelimem.equalsIgnoreCase("ocak")){
            resim.setImageResource(drawable.ocak);
        }
        if (kelimem.equalsIgnoreCase("oda")){
            resim.setImageResource(drawable.oda);
        }
        if (kelimem.equalsIgnoreCase("ödemek")){
            resim.setImageResource(drawable.odemek);
        }
        if (kelimem.equalsIgnoreCase("ödeşmek")){
            resim.setImageResource(drawable.odesmek);
        }
        if (kelimem.equalsIgnoreCase("ödev")){
            resim.setImageResource(drawable.odev);
        }
        if (kelimem.equalsIgnoreCase("ödünç")){
            resim.setImageResource(drawable.odunc);
        }
        if (kelimem.equalsIgnoreCase("öfke")){
            resim.setImageResource(drawable.ofke);
        }
        if (kelimem.equalsIgnoreCase("öğrenci")){
            resim.setImageResource(drawable.ogrenci);
        }
        if (kelimem.equalsIgnoreCase("öğrenmek")){
            resim.setImageResource(drawable.ogrenmek);
        }
        if (kelimem.equalsIgnoreCase("öğretmen")){
            resim.setImageResource(drawable.ogretmen);
        }
        if (kelimem.equalsIgnoreCase("öğüt")){
            resim.setImageResource(drawable.ogut);
        }
        if (kelimem.equalsIgnoreCase("oh olsun")){
            resim.setImageResource(drawable.oholsun);
        }
        if (kelimem.equalsIgnoreCase("okşamak")){
            resim.setImageResource(drawable.oksamak);
        }
        if (kelimem.equalsIgnoreCase("öksürmek")){
            resim.setImageResource(drawable.oksurmek);
        }
        if (kelimem.equalsIgnoreCase("okumak")){
            resim.setImageResource(drawable.okumak);
        }
        if (kelimem.equalsIgnoreCase("olabilir")){
            resim.setImageResource(drawable.olabilir);
        }
        if (kelimem.equalsIgnoreCase("olay")){
            resim.setImageResource(drawable.olay);
        }
        if (kelimem.equalsIgnoreCase("ölçmek")){
            resim.setImageResource(drawable.olcmek);
        }
        if (kelimem.equalsIgnoreCase("olmaz")){
            resim.setImageResource(drawable.olmaz);
        }
        if (kelimem.equalsIgnoreCase("ölmek")){
            resim.setImageResource(drawable.olmek);
        }
        if (kelimem.equalsIgnoreCase("olur")){
            resim.setImageResource(drawable.olur);
        }
        if (kelimem.equalsIgnoreCase("onay")){
            resim.setImageResource(drawable.onay);
        }
        if (kelimem.equalsIgnoreCase("önemli")){
            resim.setImageResource(drawable.onemli);
        }
        if (kelimem.equalsIgnoreCase("öpmek")){
            resim.setImageResource(drawable.opmek);
        }
        if (kelimem.equalsIgnoreCase("oran")){
            resim.setImageResource(drawable.oran);
        }
        if (kelimem.equalsIgnoreCase("orman")){
            resim.setImageResource(drawable.orman);
        }
        if (kelimem.equalsIgnoreCase("örnek")){
            resim.setImageResource(drawable.ornek);
        }
        if (kelimem.equalsIgnoreCase("otomatik")){
            resim.setImageResource(drawable.otomatik);
        }
        if (kelimem.equalsIgnoreCase("oturmak")){
            resim.setImageResource(drawable.oturmak);
        }
        if (kelimem.equalsIgnoreCase("övmek")){
            resim.setImageResource(drawable.ovmek);
        }
        if (kelimem.equalsIgnoreCase("oyun")){
            resim.setImageResource(drawable.oyun);
        }
        if (kelimem.equalsIgnoreCase("özlemek")){
            resim.setImageResource(drawable.ozlemek);
        }
        if (kelimem.equalsIgnoreCase("özür dilemek")){
            resim.setImageResource(drawable.ozurdilemek);
        }
        if (kelimem.equalsIgnoreCase("pahalı")){
            resim.setImageResource(drawable.pahali);
        }
        if (kelimem.equalsIgnoreCase("paket")){
            resim.setImageResource(drawable.paket);
        }
        if (kelimem.equalsIgnoreCase("palto")){
            resim.setImageResource(drawable.palto);
        }
        if (kelimem.equalsIgnoreCase("pamuk")){
            resim.setImageResource(drawable.pamuk);
        }
        if (kelimem.equalsIgnoreCase("pantolon")){
            resim.setImageResource(drawable.pantolon);
        }
        if (kelimem.equalsIgnoreCase("para bozdurmak")){
            resim.setImageResource(drawable.parabozdurmak);
        }
        if (kelimem.equalsIgnoreCase("pencere")){
            resim.setImageResource(drawable.pencere);
        }
        if (kelimem.equalsIgnoreCase("pense")){
            resim.setImageResource(drawable.pense);
        }
        if (kelimem.equalsIgnoreCase("perde")){
            resim.setImageResource(drawable.perde);
        }
        if (kelimem.equalsIgnoreCase("pil")){
            resim.setImageResource(drawable.pil);
        }
        if (kelimem.equalsIgnoreCase("pişirmek")){
            resim.setImageResource(drawable.pisirmek);
        }
        if (kelimem.equalsIgnoreCase("pişman")){
            resim.setImageResource(drawable.pisman);
        }
        if (kelimem.equalsIgnoreCase("polis")){
            resim.setImageResource(drawable.polis);
        }
        if (kelimem.equalsIgnoreCase("posta")){
            resim.setImageResource(drawable.posta);
        }
        if (kelimem.equalsIgnoreCase("problem")){
            resim.setImageResource(drawable.problem);
        }
        if (kelimem.equalsIgnoreCase("profesör")){
            resim.setImageResource(drawable.profesor);
        }
        if (kelimem.equalsIgnoreCase("program")){
            resim.setImageResource(drawable.program);
        }
        if (kelimem.equalsIgnoreCase("radar")){
            resim.setImageResource(drawable.radar);
        }
        if (kelimem.equalsIgnoreCase("radyo")){
            resim.setImageResource(drawable.radyo);
        }
        if (kelimem.equalsIgnoreCase("rahat")){
            resim.setImageResource(drawable.rahat);
        }
        if (kelimem.equalsIgnoreCase("rakip")){
            resim.setImageResource(drawable.rakip);
        }
        if (kelimem.equalsIgnoreCase("randevu")){
            resim.setImageResource(drawable.randevu);
        }
        if (kelimem.equalsIgnoreCase("rapor")){
            resim.setImageResource(drawable.rapor);
        }
        if (kelimem.equalsIgnoreCase("rastlamak")){
            resim.setImageResource(drawable.rastlamak);
        }
        if (kelimem.equalsIgnoreCase("rehber")){
            resim.setImageResource(drawable.rehber);
        }
        if (kelimem.equalsIgnoreCase("rekabet")){
            resim.setImageResource(drawable.rekabet);
        }
        if (kelimem.equalsIgnoreCase("rica etmek")){
            resim.setImageResource(drawable.ricaetmek);
        }
        if (kelimem.equalsIgnoreCase("röntgen")){
            resim.setImageResource(drawable.rontgen);
        }
        if (kelimem.equalsIgnoreCase("rüya")){
            resim.setImageResource(drawable.ruya);
        }
        if (kelimem.equalsIgnoreCase("rüzgar")){
            resim.setImageResource(drawable.ruzgar);
        }
        if (kelimem.equalsIgnoreCase("saat")){
            resim.setImageResource(drawable.saat);
        }
        if (kelimem.equalsIgnoreCase("sabah")){
            resim.setImageResource(drawable.sabah);
        }
        if (kelimem.equalsIgnoreCase("sabır")){
            resim.setImageResource(drawable.sabir);
        }
        if (kelimem.equalsIgnoreCase("saçma")){
            resim.setImageResource(drawable.sacma);
        }
        if (kelimem.equalsIgnoreCase("sağ")){
            resim.setImageResource(drawable.sag);
        }
        if (kelimem.equalsIgnoreCase("sağlam")){
            resim.setImageResource(drawable.saglam);
        }
        if (kelimem.equalsIgnoreCase("sağlık")){
            resim.setImageResource(drawable.saglik);
        }
        if (kelimem.equalsIgnoreCase("şahit")){
            resim.setImageResource(drawable.sahit);
        }
        if (kelimem.equalsIgnoreCase("sahte")){
            resim.setImageResource(drawable.sahte);
        }
        if (kelimem.equalsIgnoreCase("şaka")){
            resim.setImageResource(drawable.saka);
        }
        if (kelimem.equalsIgnoreCase("sakal")){
            resim.setImageResource(drawable.sakal);
        }
        if (kelimem.equalsIgnoreCase("sakat")){
            resim.setImageResource(drawable.sakat);
        }
        if (kelimem.equalsIgnoreCase("sakin")){
            resim.setImageResource(drawable.sakin);
        }
        if (kelimem.equalsIgnoreCase("saklamak")){
            resim.setImageResource(drawable.saklamak);
        }
        if (kelimem.equalsIgnoreCase("salak")){
            resim.setImageResource(drawable.salak);
        }
        if (kelimem.equalsIgnoreCase("salata")){
            resim.setImageResource(drawable.salata);
        }
        if (kelimem.equalsIgnoreCase("saldırmak")){
            resim.setImageResource(drawable.saldirmak);
        }
        if (kelimem.equalsIgnoreCase("sallamak")){
            resim.setImageResource(drawable.sallamak);
        }
        if (kelimem.equalsIgnoreCase("şampiyon")){
            resim.setImageResource(drawable.sampiyon);
        }
        if (kelimem.equalsIgnoreCase("şampuan")){
            resim.setImageResource(drawable.sampuan);
        }
        if (kelimem.equalsIgnoreCase("sana")){
            resim.setImageResource(drawable.sana);
        }
        if (kelimem.equalsIgnoreCase("sanane")){
            resim.setImageResource(drawable.sanane);
        }
        if (kelimem.equalsIgnoreCase("sanat")){
            resim.setImageResource(drawable.sanat);
        }
        if (kelimem.equalsIgnoreCase("sancı")){
            resim.setImageResource(drawable.sanci);
        }
        if (kelimem.equalsIgnoreCase("sandalye")){
            resim.setImageResource(drawable.sandalye);
        }
        if (kelimem.equalsIgnoreCase("sandviç")){
            resim.setImageResource(drawable.sandvic);
        }
        if (kelimem.equalsIgnoreCase("saniye")){
            resim.setImageResource(drawable.saniye);
        }
        if (kelimem.equalsIgnoreCase("şans")){
            resim.setImageResource(drawable.sans);
        }
        if (kelimem.equalsIgnoreCase("şapka")){
            resim.setImageResource(drawable.sapka);
        }
        if (kelimem.equalsIgnoreCase("sargı")){
            resim.setImageResource(drawable.sargi);
        }
        if (kelimem.equalsIgnoreCase("sarılmak")){
            resim.setImageResource(drawable.sarilmak);
        }
        if (kelimem.equalsIgnoreCase("şarkı")){
            resim.setImageResource(drawable.sarki);
        }
        if (kelimem.equalsIgnoreCase("şaşırmak")){
            resim.setImageResource(drawable.sasirmak);
        }
        if (kelimem.equalsIgnoreCase("satmak")){
            resim.setImageResource(drawable.satmak);
        }
        if (kelimem.equalsIgnoreCase("satranç")){
            resim.setImageResource(drawable.satranc);
        }
        if (kelimem.equalsIgnoreCase("savaş")){
            resim.setImageResource(drawable.savas);
        }
        if (kelimem.equalsIgnoreCase("savunma")){
            resim.setImageResource(drawable.savunma);
        }
        if (kelimem.equalsIgnoreCase("sayfa")){
            resim.setImageResource(drawable.sayfa);
        }
        if (kelimem.equalsIgnoreCase("saygı")){
            resim.setImageResource(drawable.saygi);
        }
        if (kelimem.equalsIgnoreCase("sayı")){
            resim.setImageResource(drawable.sayi);
        }
        if (kelimem.equalsIgnoreCase("sayın")){
            resim.setImageResource(drawable.sayin);
        }
        if (kelimem.equalsIgnoreCase("sebep")){
            resim.setImageResource(drawable.sebep);
        }
        if (kelimem.equalsIgnoreCase("seçim")){
            resim.setImageResource(drawable.secim);
        }
        if (kelimem.equalsIgnoreCase("sel")){
            resim.setImageResource(drawable.sel);
        }
        if (kelimem.equalsIgnoreCase("selam")){
            resim.setImageResource(drawable.selam);
        }
        if (kelimem.equalsIgnoreCase("şemsiye")){
            resim.setImageResource(drawable.semsiye);
        }
        if (kelimem.equalsIgnoreCase("senin")){
            resim.setImageResource(drawable.senin);
        }
        if (kelimem.equalsIgnoreCase("serbest")){
            resim.setImageResource(drawable.serbest);
        }
        if (kelimem.equalsIgnoreCase("servis")){
            resim.setImageResource(drawable.servis);
        }
        if (kelimem.equalsIgnoreCase("ses")){
            resim.setImageResource(drawable.ses);
        }
        if (kelimem.equalsIgnoreCase("sevgili")){
            resim.setImageResource(drawable.sevgili);
        }
        if (kelimem.equalsIgnoreCase("sevinç")){
            resim.setImageResource(drawable.sevinc);
        }
        if (kelimem.equalsIgnoreCase("seviye")){
            resim.setImageResource(drawable.seviye);
        }
        if (kelimem.equalsIgnoreCase("sevmek")){
            resim.setImageResource(drawable.sevmek);
        }
        if (kelimem.equalsIgnoreCase("şey")){
            resim.setImageResource(drawable.sey);
        }
        if (kelimem.equalsIgnoreCase("seyretmek")){
            resim.setImageResource(drawable.seyretmek);
        }
        if (kelimem.equalsIgnoreCase("sezmek")){
            resim.setImageResource(drawable.sezmek);
        }
        if (kelimem.equalsIgnoreCase("sıcak")){
            resim.setImageResource(drawable.sicak);
        }
        if (kelimem.equalsIgnoreCase("şiddet")){
            resim.setImageResource(drawable.siddet);
        }
        if (kelimem.equalsIgnoreCase("şifre")){
            resim.setImageResource(drawable.sifre);
        }
        if (kelimem.equalsIgnoreCase("sınır")){
            resim.setImageResource(drawable.siiniir);
        }
        if (kelimem.equalsIgnoreCase("şiir")){
            resim.setImageResource(drawable.siir);
        }
        if (kelimem.equalsIgnoreCase("şikayet")){
            resim.setImageResource(drawable.sikayet);
        }
        if (kelimem.equalsIgnoreCase("sıkılmak")){
            resim.setImageResource(drawable.sikilmak);
        }
        if (kelimem.equalsIgnoreCase("sıkışık")){
            resim.setImageResource(drawable.sikisik);
        }
        if (kelimem.equalsIgnoreCase("silmek")){
            resim.setImageResource(drawable.silmek);
        }
        if (kelimem.equalsIgnoreCase("şimdi")){
            resim.setImageResource(drawable.simdi);
        }
        if (kelimem.equalsIgnoreCase("sınav")){
            resim.setImageResource(drawable.sinav);
        }
        if (kelimem.equalsIgnoreCase("sinema")){
            resim.setImageResource(drawable.sinema);
        }
        if (kelimem.equalsIgnoreCase("sınıf")){
            resim.setImageResource(drawable.sinif);
        }
        if (kelimem.equalsIgnoreCase("sır")){
            resim.setImageResource(drawable.sir);
        }
        if (kelimem.equalsIgnoreCase("sıra olmak")){
            resim.setImageResource(drawable.siraolmak);
        }
        if (kelimem.equalsIgnoreCase("şırınga")){
            resim.setImageResource(drawable.siringa);
        }
        if (kelimem.equalsIgnoreCase("şişe")){
            resim.setImageResource(drawable.sise);
        }
        if (kelimem.equalsIgnoreCase("şişman")){
            resim.setImageResource(drawable.sisman);
        }
        if (kelimem.equalsIgnoreCase("şoför")){
            resim.setImageResource(drawable.sofor);
        }
        if (kelimem.equalsIgnoreCase("soğuk")){
            resim.setImageResource(drawable.soguk);
        }
        if (kelimem.equalsIgnoreCase("sohbet")){
            resim.setImageResource(drawable.sohbet);
        }
        if (kelimem.equalsIgnoreCase("sonra")){
            resim.setImageResource(drawable.sonra);
        }
        if (kelimem.equalsIgnoreCase("soru")){
            resim.setImageResource(drawable.soru);
        }
        if (kelimem.equalsIgnoreCase("söylemek")){
            resim.setImageResource(drawable.soylemek);
        }
        if (kelimem.equalsIgnoreCase("soyunmak")){
            resim.setImageResource(drawable.soyunmak);
        }
        if (kelimem.equalsIgnoreCase("sözlük")){
            resim.setImageResource(drawable.sozluk);
        }
        if (kelimem.equalsIgnoreCase("söz vermek")){
            resim.setImageResource(drawable.sozvermek);
        }
        if (kelimem.equalsIgnoreCase("şüphe")){
            resim.setImageResource(drawable.suphe);
        }
        if (kelimem.equalsIgnoreCase("sürekli çalışmak")){
            resim.setImageResource(drawable.sureklicalismak);
        }
        if (kelimem.equalsIgnoreCase("susamak")){
            resim.setImageResource(drawable.susamak);
        }
        if (kelimem.equalsIgnoreCase("tabiat")){
            resim.setImageResource(drawable.tabiat);
        }
        if (kelimem.equalsIgnoreCase("tablo")){
            resim.setImageResource(drawable.tablo);
        }
        if (kelimem.equalsIgnoreCase("taciz")){
            resim.setImageResource(drawable.taciz);
        }
        if (kelimem.equalsIgnoreCase("tahlil")){
            resim.setImageResource(drawable.tahlil);
        }
        if (kelimem.equalsIgnoreCase("tahliye")){
            resim.setImageResource(drawable.tahliye);
        }
        if (kelimem.equalsIgnoreCase("tahmin")){
            resim.setImageResource(drawable.tahmin);
        }
        if (kelimem.equalsIgnoreCase("tahta")){
            resim.setImageResource(drawable.tahta);
        }
        if (kelimem.equalsIgnoreCase("takdir")){
            resim.setImageResource(drawable.takdir);
        }
        if (kelimem.equalsIgnoreCase("takım")){
            resim.setImageResource(drawable.takim);
        }
        if (kelimem.equalsIgnoreCase("takip")){
            resim.setImageResource(R.drawable.takip);
        }
        if (kelimem.equalsIgnoreCase("taklit")){
            resim.setImageResource(drawable.taklit);
        }
        if (kelimem.equalsIgnoreCase("takmak")){
            resim.setImageResource(drawable.takmak);
        }
        if (kelimem.equalsIgnoreCase("taksi")){
            resim.setImageResource(drawable.taksi);
        }
        if (kelimem.equalsIgnoreCase("taksit")){
            resim.setImageResource(drawable.taksit);
        }
        if (kelimem.equalsIgnoreCase("takvim")){
            resim.setImageResource(drawable.takvim);
        }
        if (kelimem.equalsIgnoreCase("tamam")){
            resim.setImageResource(drawable.tamam);
        }
        if (kelimem.equalsIgnoreCase("tamir")){
            resim.setImageResource(drawable.tamir);
        }
        if (kelimem.equalsIgnoreCase("tanık")){
            resim.setImageResource(drawable.tanik);
        }
        if (kelimem.equalsIgnoreCase("tanımak")){
            resim.setImageResource(drawable.tanimak);
        }
        if (kelimem.equalsIgnoreCase("tanımamak")){
            resim.setImageResource(drawable.tanimamak);
        }
        if (kelimem.equalsIgnoreCase("tanışmak")){
            resim.setImageResource(drawable.tanismak);
        }
        if (kelimem.equalsIgnoreCase("tartışmak")){
            resim.setImageResource(drawable.tartismak);
        }
        if (kelimem.equalsIgnoreCase("tartmak")){
            resim.setImageResource(drawable.tartmak);
        }
        if (kelimem.equalsIgnoreCase("tasarruf")){
            resim.setImageResource(drawable.tasarruf);
        }
        if (kelimem.equalsIgnoreCase("tasdik")){
            resim.setImageResource(drawable.tasdik);
        }
        if (kelimem.equalsIgnoreCase("taşımak")){
            resim.setImageResource(drawable.tasimak);
        }
        if (kelimem.equalsIgnoreCase("tatil")){
            resim.setImageResource(drawable.tatil);
        }
        if (kelimem.equalsIgnoreCase("tatlı")){
            resim.setImageResource(drawable.tatli);
        }
        if (kelimem.equalsIgnoreCase("taviz")){
            resim.setImageResource(drawable.taviz);
        }
        if (kelimem.equalsIgnoreCase("tayin olmak")){
            resim.setImageResource(drawable.tayinolmak);
        }
        if (kelimem.equalsIgnoreCase("taze")){
            resim.setImageResource(drawable.taze);
        }
        if (kelimem.equalsIgnoreCase("tazminat")){
            resim.setImageResource(drawable.tazminat);
        }
        if (kelimem.equalsIgnoreCase("tebeşir")){
            resim.setImageResource(drawable.tebesir);
        }
        if (kelimem.equalsIgnoreCase("tebrik")){
            resim.setImageResource(drawable.tebrik);
        }
        if (kelimem.equalsIgnoreCase("tecavüz")){
            resim.setImageResource(drawable.tecavuz);
        }
        if (kelimem.equalsIgnoreCase("tedavi")){
            resim.setImageResource(drawable.tedavi);
        }
        if (kelimem.equalsIgnoreCase("tedbir")){
            resim.setImageResource(drawable.tedbir);
        }
        if (kelimem.equalsIgnoreCase("tehdit")){
            resim.setImageResource(drawable.tehdit);
        }
        if (kelimem.equalsIgnoreCase("tehlike")){
            resim.setImageResource(drawable.tehlike);
        }
        if (kelimem.equalsIgnoreCase("teklif")){
            resim.setImageResource(drawable.teklif);
        }
        if (kelimem.equalsIgnoreCase("tekrar")){
            resim.setImageResource(drawable.tekrar);
        }
        if (kelimem.equalsIgnoreCase("telaş")){
            resim.setImageResource(drawable.telas);
        }
        if (kelimem.equalsIgnoreCase("telefon")){
            resim.setImageResource(drawable.telefon);
        }
        if (kelimem.equalsIgnoreCase("televizyon")){
            resim.setImageResource(drawable.televizyon);
        }
        if (kelimem.equalsIgnoreCase("tembel")){
            resim.setImageResource(drawable.tembel);
        }
        if (kelimem.equalsIgnoreCase("temiz")){
            resim.setImageResource(drawable.temiz);
        }
        if (kelimem.equalsIgnoreCase("tepe")){
            resim.setImageResource(drawable.tepe);
        }
        if (kelimem.equalsIgnoreCase("terazi")){
            resim.setImageResource(drawable.terazi);
        }
        if (kelimem.equalsIgnoreCase("terbiye")){
            resim.setImageResource(drawable.terbiye);
        }
        if (kelimem.equalsIgnoreCase("tercih etmek")){
            resim.setImageResource(drawable.tercihetmek);
        }

        if (kelimem.equalsIgnoreCase("tercüman")){
            resim.setImageResource(drawable.tercuman);
        }
        if (kelimem.equalsIgnoreCase("terlemek")){
            resim.setImageResource(drawable.terlemek);
        }
        if (kelimem.equalsIgnoreCase("terlik")){
            resim.setImageResource(drawable.terlik);
        }
        if (kelimem.equalsIgnoreCase("termometre")){
            resim.setImageResource(drawable.termometre);
        }
        if (kelimem.equalsIgnoreCase("terör")){
            resim.setImageResource(drawable.teror);
        }
        if (kelimem.equalsIgnoreCase("teşekkür etmek")){
            resim.setImageResource(drawable.tesekkuretmek);
        }
        if (kelimem.equalsIgnoreCase("teslim olmak")){
            resim.setImageResource(drawable.teslimolmak);
        }
        if (kelimem.equalsIgnoreCase("tiner")){
            resim.setImageResource(drawable.tiner);
        }
        if (kelimem.equalsIgnoreCase("tiyatro")){
            resim.setImageResource(drawable.tiyatro);
        }

        if (kelimem.equalsIgnoreCase("tok")){
            resim.setImageResource(drawable.tok);
        }
        if (kelimem.equalsIgnoreCase("toplamak")){
            resim.setImageResource(drawable.toplamak);
        }
        if (kelimem.equalsIgnoreCase("toplantı")){
            resim.setImageResource(drawable.toplanti);
        }
        if (kelimem.equalsIgnoreCase("toprak")){
            resim.setImageResource(drawable.toprak);
        }
        if (kelimem.equalsIgnoreCase("trafik")){
            resim.setImageResource(drawable.trafik);
        }
        if (kelimem.equalsIgnoreCase("tükürmek")){
            resim.setImageResource(drawable.tukurmek);
        }
        if (kelimem.equalsIgnoreCase("turist")){
            resim.setImageResource(drawable.turist);
        }
        if (kelimem.equalsIgnoreCase("turizm")){
            resim.setImageResource(drawable.turizm);
        }
        if (kelimem.equalsIgnoreCase("türkiye")){
            resim.setImageResource(drawable.turkiye);
        }

        if (kelimem.equalsIgnoreCase("turşu")){
            resim.setImageResource(drawable.tursu);
        }
        if (kelimem.equalsIgnoreCase("tutkal")){
            resim.setImageResource(drawable.tutkal);
        }
        if (kelimem.equalsIgnoreCase("tutmak")){
            resim.setImageResource(drawable.tutmak);
        }
        if (kelimem.equalsIgnoreCase("tutuklu")){
            resim.setImageResource(drawable.tutuklu);
        }
        if (kelimem.equalsIgnoreCase("tuvalet")){
            resim.setImageResource(drawable.tuvalet);
        }
        if (kelimem.equalsIgnoreCase("tuz")){
            resim.setImageResource(drawable.tuz);
        }
        if (kelimem.equalsIgnoreCase("tuzluk")){
            resim.setImageResource(drawable.tuzluk);
        }
        if (kelimem.equalsIgnoreCase("vaat")){
            resim.setImageResource(drawable.vaat);
        }
        if (kelimem.equalsIgnoreCase("vade")){
            resim.setImageResource(drawable.vade);
        }

        if (kelimem.equalsIgnoreCase("vade")){
            resim.setImageResource(drawable.vade);
        }
        if (kelimem.equalsIgnoreCase("vakıf")){
            resim.setImageResource(drawable.vakif);
        }
        if (kelimem.equalsIgnoreCase("vali")){
            resim.setImageResource(drawable.vali);
        }
        if (kelimem.equalsIgnoreCase("valiz")){
            resim.setImageResource(drawable.valiz);
        }
        if (kelimem.equalsIgnoreCase("vana")){
            resim.setImageResource(drawable.vana);
        }
        if (kelimem.equalsIgnoreCase("vapur")){
            resim.setImageResource(drawable.vapur);
        }
        if (kelimem.equalsIgnoreCase("var")){
            resim.setImageResource(drawable.var);
        }
        if (kelimem.equalsIgnoreCase("vatan")){
            resim.setImageResource(drawable.vatan);
        }
        if (kelimem.equalsIgnoreCase("vatandaş")){
            resim.setImageResource(drawable.vatandas);
        }
        if (kelimem.equalsIgnoreCase("vazgeçmek")){
            resim.setImageResource(drawable.vazgecmek);
        }
        if (kelimem.equalsIgnoreCase("ve")){
            resim.setImageResource(drawable.ve);
        }
        if (kelimem.equalsIgnoreCase("veda")){
            resim.setImageResource(drawable.veda);
        }
        if (kelimem.equalsIgnoreCase("veli")){
            resim.setImageResource(drawable.veli);
        }
        if (kelimem.equalsIgnoreCase("vergi")){
            resim.setImageResource(drawable.vergi);
        }
        if (kelimem.equalsIgnoreCase("vermek")){
            resim.setImageResource(drawable.vermek);
        }
        if (kelimem.equalsIgnoreCase("vermem")){
            resim.setImageResource(drawable.vermem);
        }
        if (kelimem.equalsIgnoreCase("veya")){
            resim.setImageResource(drawable.veya);
        }
        if (kelimem.equalsIgnoreCase("vezne")){
            resim.setImageResource(drawable.vezne);
        }
        if (kelimem.equalsIgnoreCase("vicdan")){
            resim.setImageResource(drawable.vicdan);
        }
        if (kelimem.equalsIgnoreCase("vida")){
            resim.setImageResource(drawable.vida);
        }
        if (kelimem.equalsIgnoreCase("video")){
            resim.setImageResource(drawable.video);
        }
        if (kelimem.equalsIgnoreCase("virüs")){
            resim.setImageResource(drawable.virus);
        }
        if (kelimem.equalsIgnoreCase("voleybol")){
            resim.setImageResource(drawable.voleybol);
        }
        if (kelimem.equalsIgnoreCase("volkan")){
            resim.setImageResource(drawable.volkan);
        }
        if (kelimem.equalsIgnoreCase("vücut")){
            resim.setImageResource(drawable.vucut);
        }
        if (kelimem.equalsIgnoreCase("vurmak")){
            resim.setImageResource(drawable.vurmak);
        }
        if (kelimem.equalsIgnoreCase("yabancı")){
            resim.setImageResource(drawable.yabanci);
        }
        if (kelimem.equalsIgnoreCase("yağmur")){
            resim.setImageResource(drawable.yagmur);
        }
        if (kelimem.equalsIgnoreCase("yaka")){
            resim.setImageResource(drawable.yaka);
        }
        if (kelimem.equalsIgnoreCase("yakalamak")){
            resim.setImageResource(drawable.yakalamak);
        }
        if (kelimem.equalsIgnoreCase("yaka silkmek")){
            resim.setImageResource(drawable.yakasilkmek);
        }
        if (kelimem.equalsIgnoreCase("yakın")){
            resim.setImageResource(drawable.yakin);
        }
        if (kelimem.equalsIgnoreCase("yakışıklı")){
            resim.setImageResource(drawable.yakisikli);
        }
        if (kelimem.equalsIgnoreCase("yakışmak")){
            resim.setImageResource(drawable.yakismak);
        }
        if (kelimem.equalsIgnoreCase("yakmak")){
            resim.setImageResource(drawable.yakmak);
        }
        if (kelimem.equalsIgnoreCase("yalan")){
            resim.setImageResource(drawable.yalan);
        }
        if (kelimem.equalsIgnoreCase("yalnız")){
            resim.setImageResource(drawable.yalniz);
        }
        if (kelimem.equalsIgnoreCase("yalvarmak")){
            resim.setImageResource(drawable.yalvarmak);
        }
        if (kelimem.equalsIgnoreCase("yangın")){
            resim.setImageResource(drawable.yangin);
        }
        if (kelimem.equalsIgnoreCase("yanlış")){
            resim.setImageResource(drawable.yanlis);
        }
        if (kelimem.equalsIgnoreCase("yapışkan")){
            resim.setImageResource(drawable.yapiskan);
        }
        if (kelimem.equalsIgnoreCase("yapmak")){
            resim.setImageResource(drawable.yapmak);
        }
        if (kelimem.equalsIgnoreCase("yara")){
            resim.setImageResource(drawable.yara);
        }
        if (kelimem.equalsIgnoreCase("yaramaz")){
            resim.setImageResource(drawable.yaramaz);
        }
        if (kelimem.equalsIgnoreCase("yardım")){
            resim.setImageResource(drawable.yardim);
        }
        if (kelimem.equalsIgnoreCase("yarın")){
            resim.setImageResource(drawable.yarin);
        }
        if (kelimem.equalsIgnoreCase("yarışma")){
            resim.setImageResource(drawable.yarisma);
        }
        if (kelimem.equalsIgnoreCase("yarım")){
            resim.setImageResource(drawable.yarrim);
        }
        if (kelimem.equalsIgnoreCase("yaş")){
            resim.setImageResource(drawable.yas);
        }
        if (kelimem.equalsIgnoreCase("yasak")){
            resim.setImageResource(drawable.yasak);
        }
        if (kelimem.equalsIgnoreCase("yaşamak")){
            resim.setImageResource(drawable.yasamak);
        }
        if (kelimem.equalsIgnoreCase("yaşlı")){
            resim.setImageResource(drawable.yasli);
        }
        if (kelimem.equalsIgnoreCase("yatak")){
            resim.setImageResource(drawable.yatak);
        }
        if (kelimem.equalsIgnoreCase("yavaş")){
            resim.setImageResource(drawable.yavas);
        }
        if (kelimem.equalsIgnoreCase("yaymak")){
            resim.setImageResource(drawable.yaymak);
        }
        if (kelimem.equalsIgnoreCase("yazık")){
            resim.setImageResource(drawable.yazik);
        }
        if (kelimem.equalsIgnoreCase("yazmak")){
            resim.setImageResource(drawable.yazmak);
        }
        if (kelimem.equalsIgnoreCase("yemek")){
            resim.setImageResource(drawable.yemek);
        }
        if (kelimem.equalsIgnoreCase("yemin")){
            resim.setImageResource(drawable.yemin);
        }
        if (kelimem.equalsIgnoreCase("yeni")){
            resim.setImageResource(drawable.yeni);
        }
        if (kelimem.equalsIgnoreCase("yenilmek")){
            resim.setImageResource(drawable.yenilmek);
        }
        if (kelimem.equalsIgnoreCase("yenmek")){
            resim.setImageResource(drawable.yenmek);
        }
        if (kelimem.equalsIgnoreCase("yer")){
            resim.setImageResource(drawable.yer);
        }
        if (kelimem.equalsIgnoreCase("yeter")){
            resim.setImageResource(drawable.yeter);
        }
        if (kelimem.equalsIgnoreCase("yıkamak")){
            resim.setImageResource(drawable.yikamak);
        }
        if (kelimem.equalsIgnoreCase("yıkanmak")){
            resim.setImageResource(drawable.yikanmak);
        }
        if (kelimem.equalsIgnoreCase("yıkmak")){
            resim.setImageResource(drawable.yikmak);
        }
        if (kelimem.equalsIgnoreCase("yırtmak")){
            resim.setImageResource(drawable.yirtmak);
        }
        if (kelimem.equalsIgnoreCase("yok")){
            resim.setImageResource(drawable.yok);
        }
        if (kelimem.equalsIgnoreCase("yorulmak")){
            resim.setImageResource(drawable.yorulmak);
        }
        if (kelimem.equalsIgnoreCase("yumuşak")){
            resim.setImageResource(drawable.yumusak);
        }
        if (kelimem.equalsIgnoreCase("yürek")){
            resim.setImageResource(drawable.yurek);
        }
        if (kelimem.equalsIgnoreCase("yürümek")){
            resim.setImageResource(drawable.yurumek);
        }
        if (kelimem.equalsIgnoreCase("yüz")){
            resim.setImageResource(drawable.yuz);
        }
        if (kelimem.equalsIgnoreCase("yüzmek")){
            resim.setImageResource(drawable.yuzmek);
        }
        if (kelimem.equalsIgnoreCase("yüzük")){
            resim.setImageResource(drawable.yuzuk);
        }
        if (kelimem.equalsIgnoreCase("zabıta")){
            resim.setImageResource(drawable.zabita);
        }
        if (kelimem.equalsIgnoreCase("zam")){
            resim.setImageResource(drawable.zam);
        }
        if (kelimem.equalsIgnoreCase("zaman")){
            resim.setImageResource(drawable.zaman);
        }
        if (kelimem.equalsIgnoreCase("zarar")){
            resim.setImageResource(drawable.zarar);
        }
        if (kelimem.equalsIgnoreCase("zarf")){
            resim.setImageResource(drawable.zarf);
        }
        if (kelimem.equalsIgnoreCase("zayıf")){
            resim.setImageResource(drawable.zayif);
        }
        if (kelimem.equalsIgnoreCase("zeki")){
            resim.setImageResource(drawable.zeki);
        }
        if (kelimem.equalsIgnoreCase("zengin")){
            resim.setImageResource(drawable.zengin);
        }
        if (kelimem.equalsIgnoreCase("zeytin")){
            resim.setImageResource(drawable.zeytin);
        }
        if (kelimem.equalsIgnoreCase("zil")){
            resim.setImageResource(drawable.zil);
        }
        if (kelimem.equalsIgnoreCase("zincir")){
            resim.setImageResource(drawable.zincir);
        }
        if (kelimem.equalsIgnoreCase("zor")){
            resim.setImageResource(drawable.zor);
        }
        if (kelimem.equalsIgnoreCase("zürafa")){
            resim.setImageResource(drawable.zurafa);
        }
        if (kelimem.equalsIgnoreCase("zurna")){
            resim.setImageResource(drawable.zurna);
        }
        if (kelimem.equalsIgnoreCase("uçak")){
            resim.setImageResource(drawable.ucak);
        }
        if (kelimem.equalsIgnoreCase("uçmak")){
            resim.setImageResource(drawable.ucmak);
        }
        if (kelimem.equalsIgnoreCase("ücret")){
            resim.setImageResource(drawable.ucret);
        }
        if (kelimem.equalsIgnoreCase("ucuz")){
            resim.setImageResource(drawable.ucuz);
        }
        if (kelimem.equalsIgnoreCase("üflemek")){
            resim.setImageResource(drawable.uflemek);
        }
        if (kelimem.equalsIgnoreCase("ukala")){
            resim.setImageResource(drawable.ukala);
        }
        if (kelimem.equalsIgnoreCase("umut")){
            resim.setImageResource(drawable.umut);
        }
        if (kelimem.equalsIgnoreCase("üniversite")){
            resim.setImageResource(drawable.universite);
        }
        if (kelimem.equalsIgnoreCase("unutmak")){
            resim.setImageResource(drawable.unutmak);
        }
        if (kelimem.equalsIgnoreCase("usta")){
            resim.setImageResource(drawable.usta);
        }
        if (kelimem.equalsIgnoreCase("üşümek")){
            resim.setImageResource(drawable.usumek);
        }
        if (kelimem.equalsIgnoreCase("utanmak")){
            resim.setImageResource(drawable.utanmak);
        }
        if (kelimem.equalsIgnoreCase("uygun")){
            resim.setImageResource(drawable.uygun);
        }
        if (kelimem.equalsIgnoreCase("uyumak")){
            resim.setImageResource(drawable.uyumak);
        }
        if (kelimem.equalsIgnoreCase("uzak")){
            resim.setImageResource(drawable.uzak);
        }
        if (kelimem.equalsIgnoreCase("üzülmek")){
            resim.setImageResource(drawable.uzulmek);
        }
        if (kelimem.equalsIgnoreCase("uzun")){
            resim.setImageResource(drawable.uzun);
        }

        
    }


}