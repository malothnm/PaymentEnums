package in.nmaloth.payments.constants.products;

import in.nmaloth.payments.constants.InternationalApplied;
import in.nmaloth.payments.constants.account.BalanceTypes;

import java.util.Objects;

public class BlockingBalanceType implements Comparable<BlockingBalanceType> {
    private String internationalApplied;
    private String balanceTypes;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof BlockingBalanceType)) {
            return false;
        } else {
            BlockingBalanceType that = (BlockingBalanceType) o;
            return this.getBalanceTypes().equals(that.getBalanceTypes());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getBalanceTypes()});
    }

    public int compareTo(BlockingBalanceType o) {
        return this.balanceTypes.compareTo(o.getBalanceTypes());
    }


    public static BlockingBalanceType.BlockingBalanceTypeBuilder builder() {
        return new BlockingBalanceType.BlockingBalanceTypeBuilder();
    }

    public String getInternationalApplied() {
        return this.internationalApplied;
    }

    public String getBalanceTypes() {
        return this.balanceTypes;
    }

    public void setInternationalApplied(final String internationalApplied) {
        this.internationalApplied = internationalApplied;
    }

    public void setBalanceTypes(final String balanceTypes) {
        this.balanceTypes = balanceTypes;
    }

    public BlockingBalanceType(final String internationalApplied, final String balanceTypes) {
        if(internationalApplied != null){
            this.internationalApplied = internationalApplied;
        }
        this.balanceTypes = balanceTypes;
    }

    public BlockingBalanceType() {
    }

    public static class BlockingBalanceTypeBuilder {
        private InternationalApplied internationalApplied;
        private BalanceTypes balanceTypes;

        BlockingBalanceTypeBuilder() {
        }

        public BlockingBalanceType.BlockingBalanceTypeBuilder internationalApplied(final InternationalApplied internationalApplied) {
            this.internationalApplied = internationalApplied;
            return this;
        }

        public BlockingBalanceType.BlockingBalanceTypeBuilder balanceTypes(final BalanceTypes balanceTypes) {
            this.balanceTypes = balanceTypes;
            return this;
        }

        public BlockingBalanceType build() {
            return new BlockingBalanceType(this.internationalApplied.getBlockInternational(), this.balanceTypes.getBalanceTypes());
        }

        public String toString() {
            return "BlockingBalanceType.BlockingBalanceTypeBuilder(internationalApplied=" + this.internationalApplied + ", balanceTypes=" + this.balanceTypes + ")";
        }
    }
}
