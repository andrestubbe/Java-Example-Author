package examples.javax.crypto;

import javax.crypto.Cipher;
import java.security.Key;
import java.util.Base64;

/**
 * This class demonstrates the usage of
 * ProviderVerifier to verify a specific
 * cryptographic provider available in
 * the system environment. The example
 * uses the 'AES' symmetric encryption algorithm,
 * specifically the Advanced Encryption Standard (AES)
 * key length of 128 bits and block size of 16 bytes.
 * For more information on AES, please refer to
 * RFC 5246 - The 'TLS Protocol Version 1.2' document.
 */
public class ProviderVerifier_verify_Example {

    /**
     * This method is used to demonstrate the usage
     * of {@link ProviderVerifier#verify(String)}
     * method for verifying a specific cryptographic provider.
     */
    public static void main(String[] args) throws Exception {
        // Instantiate the Cipher object
        Cipher cipher = Cipher.getInstance("AES");

        // Generate the secret key for AES encryption
        Key secretKey = cipher.generateSecretKey();

        // Print the Base64 encoded representation of the secret key
        System.out.println(Base64.getEncoder().encodeToString(secretKey.getEncoded())) ;

        // Verify that the specified cryptographic provider is available in the system environment
        ProviderVerifier.verify("MyCryptoProvider");
    }
}