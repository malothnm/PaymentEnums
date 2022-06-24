package in.nmaloth.payments.constants.products;

import in.nmaloth.payments.constants.InternationalApplied;
import in.nmaloth.payments.constants.TransactionType;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class BlockingTransactionType implements Comparable<BlockingTransactionType> {
    private String internationalApplied;
    private String transactionType;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof BlockingTransactionType)) {
            return false;
        } else {
            BlockingTransactionType that = (BlockingTransactionType)o;
            return this.getTransactionType().equals(that.getTransactionType());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getTransactionType()});
    }

    public int compareTo(BlockingTransactionType o) {
        return this.transactionType.compareTo(o.getTransactionType());
    }


    public static BlockingTransactionType.BlockingTransactionTypeBuilder builder() {
        return new BlockingTransactionType.BlockingTransactionTypeBuilder();
    }

    public String getInternationalApplied() {
        return this.internationalApplied;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setInternationalApplied(final String internationalApplied) {
        this.internationalApplied = internationalApplied;
    }

    public void setTransactionType(final String transactionType) {
        this.transactionType = transactionType;
    }

    public BlockingTransactionType() {
    }

    public BlockingTransactionType(final String internationalApplied, final String transactionType) {

        if(internationalApplied != null){
            this.internationalApplied = internationalApplied;
        }

        this.transactionType = transactionType;
    }

    public static class BlockingTransactionTypeBuilder {
        private InternationalApplied internationalApplied;
        private TransactionType transactionType;

        BlockingTransactionTypeBuilder() {
        }

        public BlockingTransactionType.BlockingTransactionTypeBuilder internationalApplied(final InternationalApplied internationalApplied) {
            this.internationalApplied = internationalApplied;
            return this;
        }

        public BlockingTransactionType.BlockingTransactionTypeBuilder transactionType(final TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public BlockingTransactionType build() {
            return new BlockingTransactionType(this.internationalApplied.getBlockInternational(), this.transactionType.getTransactionType());
        }

        public String toString() {
            return "BlockingTransactionType.BlockingTransactionTypeBuilder(internationalApplied=" + this.internationalApplied + ", transactionType=" + this.transactionType + ")";
        }
    }
}

