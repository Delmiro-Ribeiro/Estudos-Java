import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void cria() throws Exception{
        //leitura da imagem

       BufferedImage imagemOriginal =  ImageIO.read(new File("/images/TopMovies_2.jpg"));


        //cria nova imagem em memoria com transparencia e com tamanho novo

        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;

        BufferedImage novaImagem = new BufferedImage(largura, novaAltura,BufferedImage.TRANSLUCENT);


        //copiar a imagem original pra novo imagem (em memoria)

        Graphics2D grafics = (Graphics2D) novaImagem.getGraphics();
        grafics.drawImage(imagemOriginal,0,0,null);

        //escrever uma frase na nova imagem



        //escrever a nova imagem em um novo arquivo
        ImageIO.write(novaImagem, "png", new File("Saida/figurinha.png"));
    }
    public static void main(String[] args) throws Exception {
        var gerador = new GeradorDeFigurinhas();
        gerador.cria();
    }
    
}
