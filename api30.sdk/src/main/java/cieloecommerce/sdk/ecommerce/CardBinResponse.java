package cieloecommerce.sdk.ecommerce;

import com.google.gson.annotations.SerializedName;

public class CardBinResponse {

    @SerializedName("Status")
    private String status;

    @SerializedName("Provider")
    private String provider;

    @SerializedName("CardType")
    private String cardType;

    @SerializedName("ForeignCard")
    private String foreignCard;

    public CardBinResponse(String status, String provider, String cardType, String foreignCard) {
        this.status = status;
        this.provider = provider;
        this.cardType = cardType;
        this.foreignCard = foreignCard;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getForeignCard() {
        return foreignCard;
    }

    public void setForeignCard(String foreignCard) {
        this.foreignCard = foreignCard;
    }
}
