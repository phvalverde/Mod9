public class Mod9 {
    public static void main(String[] args) {
        casting();
        wrappers();
    }
    private static void wrappers() {

        // wrapper class = Proporciona uma forma de usar primitive type com reference types
        //                 reference data types contém métodos úteis
        //                 podem ser usados com coleções (ex.Arraylist)

        // Primitive        // Wrapper
        // --------         ---------
        // boolean          Boolean
        // char             Character
        // int              Integer
        // double           Double

        // boxing/autoboxing = A conversão automática que o Java compiler faz entre primitive types e seu correspondente direto wrapper class.
        // unboxing = O reverso do boxing. Conversão automática da wrapper class para primitive type.
        // https://www.youtube.com/watch?v=4MiEznM8y8Q
        
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Integer f = 122;
        Double d = 3.14;
        String e = "Bro";

        // Feito isso, agora é só typar por exemplo "a." que aparecerá métodos úteis daquela wrapper.

        System.out.println(c.compareTo(f));

        // A vantagem das primitive types é que são bem mais rápidas, fáceis de retornar o valor delas comparadas as wrappers.
        // Por mais que "a" seja um wrapper type, ele ainda se comporta como um primitivo por causa do feature unboxing
        if(a==true) {
            System.out.println("This is true");
        }

    }
    private static void casting() {

        //Casting Explícito, ao tentar pegar o conteúdo de uma variável de bits maior,
        // "caixa" grande para colocar numa pequena, o java encontra um erro, pois é uma
        // operação que provavelmente trará um valor errado, para forçar
        // o casting é necessário adicionar a variável () reafirmando a operação.

        int numero = 30;
        short numero1 = (short) numero;
        System.out.println(numero1);
        //Nessa primeira tentativa, a operação faz sentido pois o valor dentro do
        // (int 32bits) é baixo, logo caberá de forma total dentro do (short 16bits).

        int numero2 = 300000000;
        short numero3 = (short) numero2;
        System.out.println(numero3);
        //Já na segunda tentativa, como usei todos os caracteres possíveis da variável
        // (int 32bits), ao forçar o casting, o valor retornado na forma (short 16bits)
        // não fará sentido.



        //Casting implícito, esse acontece de forma natural no Java
        // mudando o conteúdo de uma "caixa" pequena pra uma grande,
        // obviamente não há problema, afinal a "caixa" comportará tudo.

        short num = 10000;
        int num2 = num;
        System.out.println(num2);
        //Estou tirando o valor de dentro da caixa pequena (short 16bits), e
        // adicionando a caixa média (int 32bits), como é uma operação que faz
        // sentido, não é necessário reafirmar a variável.

        int num1 = 999999999;
        long num3 = num1;
        System.out.println(num3);

    }
}