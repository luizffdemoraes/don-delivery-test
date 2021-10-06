package com.doncorleone.dondelivery.entities.enums;

public enum PaymentStatus {

    PENDING(1, "pendente"),
    SETTLED(2, "quitado"),
    CANCELED(3, "cancelado");

    private Integer cod;
    private String descricao;

    PaymentStatus(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public static PaymentStatus toEnum(Integer cod) {
        for (PaymentStatus estado : PaymentStatus.values()) {
            if (estado.getCod().equals(cod))
                return estado;
        }

        throw new IllegalArgumentException("Código inválido: " + cod);
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
