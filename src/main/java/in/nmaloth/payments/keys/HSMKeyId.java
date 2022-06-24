package in.nmaloth.payments.keys;

import in.nmaloth.payments.keys.constants.KeyType;

import java.util.Objects;


public class HSMKeyId {

    private int org;
    private int product;
    private KeyType keyType;
    private String zone = "00";

    public HSMKeyId(int org, int product, KeyType keyType, String zone) {
        this.org = org;
        this.product = product;
        this.keyType = keyType;
        this.zone = zone;
    }

    public HSMKeyId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HSMKeyId)) return false;
        HSMKeyId hsmKeyId = (HSMKeyId) o;
        return getOrg() == hsmKeyId.getOrg() &&
                getProduct() == hsmKeyId.getProduct() &&
                getKeyType() == hsmKeyId.getKeyType() &&
                getZone().equals(hsmKeyId.getZone());
    }


    public int getOrg() {
        return org;
    }

    public void setOrg(int org) {
        this.org = org;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(KeyType keyType) {
        this.keyType = keyType;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrg(), getProduct(), getKeyType(), getZone());
    }


    public static HSMKeyId.HSMKeyIdBuilder builder() {
        return new HSMKeyId.HSMKeyIdBuilder();
    }

    public static class HSMKeyIdBuilder {
        private int org;
        private int product;
        private KeyType keyType;
        private String zone;

        HSMKeyIdBuilder() {
        }

        public HSMKeyId.HSMKeyIdBuilder org(int org) {
            this.org = org;
            return this;
        }

        public HSMKeyId.HSMKeyIdBuilder product(int product) {
            this.product = product;
            return this;
        }

        public HSMKeyId.HSMKeyIdBuilder keyType(KeyType keyType) {
            this.keyType = keyType;
            return this;
        }

        public HSMKeyId.HSMKeyIdBuilder zone(String zone) {
            this.zone = zone;
            return this;
        }

        public HSMKeyId build() {
            return new HSMKeyId(this.org, this.product, this.keyType, this.zone);
        }

        public String toString() {
            return "HSMKeyId.HSMKeyIdBuilder(org=" + this.org + ", product=" + this.product + ", keyType=" + this.keyType + ", zone=" + this.zone + ")";
        }
    }

}
