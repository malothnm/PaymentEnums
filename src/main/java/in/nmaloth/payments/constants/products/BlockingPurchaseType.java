package in.nmaloth.payments.constants.products;

import in.nmaloth.payments.constants.InternationalApplied;
import in.nmaloth.payments.constants.PurchaseTypes;

import java.util.Objects;

public class BlockingPurchaseType implements Comparable<BlockingPurchaseType> {

    private String internationalApplied;
    private String purchaseTypes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockingPurchaseType that = (BlockingPurchaseType) o;
        return getPurchaseTypes().equals(that.getPurchaseTypes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPurchaseTypes());
    }

    public int compareTo(BlockingPurchaseType o) {
        return this.purchaseTypes.compareTo(o.getPurchaseTypes());
    }


    public static BlockingPurchaseTypeBuilder builder() {
        return new BlockingPurchaseTypeBuilder();
    }

    public String getInternationalApplied() {
        return this.internationalApplied;
    }

    public String getPurchaseTypes() {
        return this.purchaseTypes;
    }

    public void setInternationalApplied(final String internationalApplied) {
        this.internationalApplied = internationalApplied;
    }

    public void setPurchaseTypes(final String purchaseTypes) {
        this.purchaseTypes = purchaseTypes;
    }

    public BlockingPurchaseType(final String internationalApplied, final String balanceTypes) {

        if(internationalApplied != null){
            this.internationalApplied = internationalApplied;
        }
        this.purchaseTypes = balanceTypes;
    }

    public BlockingPurchaseType() {
    }

    public static class BlockingPurchaseTypeBuilder {
        private InternationalApplied internationalApplied;
        private PurchaseTypes purchaseTypes;

        BlockingPurchaseTypeBuilder() {
        }

        public BlockingPurchaseTypeBuilder internationalApplied(final InternationalApplied internationalApplied) {
            this.internationalApplied = internationalApplied;
            return this;
        }

        public BlockingPurchaseTypeBuilder purchaseTypes(final PurchaseTypes purchaseTypes) {
            this.purchaseTypes = purchaseTypes;
            return this;
        }

        public BlockingPurchaseType build() {
            return new BlockingPurchaseType(this.internationalApplied.getBlockInternational(), this.purchaseTypes.getPurchaseTypes());
        }

        public String toString() {
            return "BlockingBalanceType.BlockingBalanceTypeBuilder(internationalApplied=" + this.internationalApplied + ", balanceTypes=" + this.purchaseTypes + ")";
        }
    }
}
