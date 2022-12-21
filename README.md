# resume-builder
Resume Builder Html, Css, Thymeleaf ve JSON ile yapılmış bir cv dökümanı oluşturma aracıdır:

![Alt text](https://github.com/eminarikan/resume-builder/blob/master/resume-1.png "Cv")

## Kullanmak için:
  1. Repository'yi zip olarak indirin ve zip dosyasını ayıklayın veya git ile aşağıdaki linki kullanarak projeyi klonlayın
          
          git clone https://github.com/eminarikan/resume-builder
          
  2. İnen klasörü açtıktan `src/main/resources/` konumundaki `profile.json` dosyasını kendi bilgilerinizle doldurun.
      - Eğitim, deneyim ve proje kısımlarındaki girdilerin sayısını objeler arasına virgüller koyarak artırıp azalatabilirsiniz. 
      - Yetenekler kısmındaki ikonlar için `src/main/resources/static/icons/skills` klasörüne bakabilir veya kendi ikonlarınızı bu klasöre ekleyebilirsiniz (program bu klasörde ikon arayacaktır dolayısı ile ikonlarınızı buraya ekleyin). 
      - Yeteneklerinizin seviyelerini 1 yıldızdan 5 yıldıza kadar ayarlayabilirisiniz. Bunun için ilgili yetenek objesinin `"rate"` değişkenine `"ONE"`, `"TWO"`, `"THREE"`, `"FOUR"`, `"FIVE"` değerlerinden birini verin.
  3. Json dosyasını hazırladıktan sonra komut istemcinizden proje rootuna gelin  örn: `cd resume-builder`.
  4. Komut istemciniz proje rootu konumundayken `./mvnw package` komutunu girin. Bu komut projeye derleyip paketleyecektir.
  5. `BUILD SUCCESSFUL` çıktısını gördükten sonra komut istemcisinden target klasörüne gidin `cd target`
  6. komut istemciniz `../resume-builder/target` konumundayken  `java -jar resume-builder-0.0.1-SNAPSHOT.jar` komutunu çalıştırın.
  7. Tarayıcınızdan `localhost:8080/` linkine giderek json dosyasından oluşturulmuş cv dökümanınızı bulabilirsiniz.
