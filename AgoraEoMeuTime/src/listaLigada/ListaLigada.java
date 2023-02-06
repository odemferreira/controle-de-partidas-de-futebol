package listaLigada;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        Elemento novoElemento = new Elemento(novoValor);    //adicionando 1 elemento
        if (this.primeiro == null & this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;         //onde estou
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remover(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;                       //onde estou
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {                      //se houver apenas um elemento na lista
                    this.primeiro = null;
                    this.ultimo = null;
                    atual = null;
                } else if (atual == primeiro) {               //REMOVENDO O 1 DA LISTA
                    this.primeiro = atual.getProximo();       //informa  novo primeiro da lista
                    atual.setProximo(null);
                } else if (atual == ultimo) {                 //REMOVENDO O ULTIMO DA LISTA
                    this.ultimo = anterior;                   //o anterior e o ultimo
                    anterior.setProximo(null);                //ou seja, existe proximo
                } else {                                      //REMOVENDO DO MEIO DA LISTA
                    anterior.setProximo(atual.getProximo());  //anterior tem como proximo outro elemento
                    atual = null;                             //pois o elemento do meio foi removido
                }
                this.tamanho--;                               //ajusta novo tamanho
                break;
            }
            anterior = atual;             //anterior era nulo, e se movimenta pra frente, onde esta o atual
            atual = atual.getProximo();   //atual se movimenta pra frente, onde esta o proximo
        }
    }

    public void empate(String valorProcurado) {
        Elemento atual = this.primeiro;                       //onde estou
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {                      //se houver apenas um elemento na lista
                    this.primeiro = null;
                    this.ultimo = null;
                } else {
                    primeiro = atual.getProximo();            //proximo e o primeiro
                    ultimo = atual;                           //novo ultimo
                }
                this.tamanho--;                               //ajusta novo tamanho
                break;

            }
            atual = atual.getProximo();                       //primeiro q se torna penultimo
            this.ultimo.setProximo(primeiro);                 //2 valores do inicio aparecem no fim da lista
            this.tamanho++;
        }
    }
                                                                                  
    public void primeiroQSai(String valorProcurado) {
        Elemento atual = this.primeiro;                       //onde estou
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {                      //se houver apenas um elemento na lista
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if(atual == primeiro){   
                    primeiro = atual.getProximo();  
                }
            }
            this.ultimo.setProximo(atual);                       //"a" aparece na lista *
            ultimo = atual;                                      //novo ultimo
        }
        }
    
    public void segundoQSai(String valorProcurado) {
        Elemento anterior = null;
        Elemento atual = this.primeiro;                       //onde estou
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equalsIgnoreCase(valorProcurado)) {
                if (this.tamanho == 1) {                      //se houver apenas um elemento na lista
                    this.primeiro = null;
                    this.ultimo = null;
                } else {
                    anterior.setProximo(atual.getProximo());  //anterior tem como proximo outro elemento
                    atual = null;
                }
                this.tamanho--;                               //tira do inicio
                break;
            }
            anterior = atual;
            atual = atual.getProximo();                       
            this.ultimo.setProximo(atual);                    //"b" aparece no fim da lista
            ultimo = atual;                                   //"b" e o ultimo
            this.tamanho++;                                   //add no final
        }
    }
}






