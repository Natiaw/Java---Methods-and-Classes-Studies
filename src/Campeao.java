class Campeao extends Habilidades {
    private String championName = "Teemo"; //atributo do campeao

    public static void main(String[] args) {
        Campeao meuCampeao = new Campeao(); //cria um objeto Campeao
        meuCampeao.useR(); //chama a funcao de habilidades pq é extensao

        System.out.println("A habilidade " + meuCampeao.r + " " + meuCampeao.championName);
    }
}
