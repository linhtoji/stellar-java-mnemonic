import com.soneso.stellarmnemonics.Wallet;
import com.soneso.stellarmnemonics.WalletException;
import org.junit.Assert;
import org.junit.Test;

public class MnemonicGeneration {

    @Test
    public void test12WordMnemonicGeneration() throws WalletException {

        String mnemonic = Wallet.generate12WordMnemonic();
        String[] words = mnemonic.split(" ");

        Assert.assertEquals(12, words.length);
    }

    @Test
    public void test24WordMnemonicGeneration() throws WalletException {

        String mnemonic = Wallet.generate24WordMnemonic();
        String[] words = mnemonic.split(" ");

        Assert.assertEquals(24, words.length);
    }
}
