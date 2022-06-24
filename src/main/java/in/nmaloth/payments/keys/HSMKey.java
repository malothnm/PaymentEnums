package in.nmaloth.payments.keys;



public class HSMKey {

    private String keyA;
    private String keyB;
    private String kcv;
    private String keyScheme;

    public HSMKey(String keyA, String keyB, String kcv, String keyScheme) {
        this.keyA = keyA;
        this.keyB = keyB;
        this.kcv = kcv;
        this.keyScheme = keyScheme;
    }

    public HSMKey() {
    }

    public String getKeyA() {
        return keyA;
    }

    public void setKeyA(String keyA) {
        this.keyA = keyA;
    }

    public String getKeyB() {
        return keyB;
    }

    public void setKeyB(String keyB) {
        this.keyB = keyB;
    }

    public String getKcv() {
        return kcv;
    }

    public void setKcv(String kcv) {
        this.kcv = kcv;
    }

    public String getKeyScheme() {
        return keyScheme;
    }

    public void setKeyScheme(String keyScheme) {
        this.keyScheme = keyScheme;
    }

    public static HSMKey.HSMKeyBuilder builder() {
        return new HSMKey.HSMKeyBuilder();
    }


    public static class HSMKeyBuilder {
        private String keyA;
        private String keyB;
        private String kcv;
        private String keyScheme;

        HSMKeyBuilder() {
        }

        public HSMKey.HSMKeyBuilder keyA(String keyA) {
            this.keyA = keyA;
            return this;
        }

        public HSMKey.HSMKeyBuilder keyB(String keyB) {
            this.keyB = keyB;
            return this;
        }

        public HSMKey.HSMKeyBuilder kcv(String kcv) {
            this.kcv = kcv;
            return this;
        }

        public HSMKey.HSMKeyBuilder keyScheme(String keyScheme) {
            this.keyScheme = keyScheme;
            return this;
        }

        public HSMKey build() {
            return new HSMKey(this.keyA, this.keyB, this.kcv, this.keyScheme);
        }

        public String toString() {
            return "HSMKey.HSMKeyBuilder(keyA=" + this.keyA + ", keyB=" + this.keyB + ", kcv=" + this.kcv + ", keyScheme=" + this.keyScheme + ")";
        }
    }

}
