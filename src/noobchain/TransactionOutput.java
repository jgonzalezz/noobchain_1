package noobchain;

import java.security.PublicKey;

/**
 * @author JGonzalezLo
 *
 */
public class TransactionOutput {
	public String id;
	public PublicKey reciepient; // also known as the new owner of these coins.
	public float value; // the amount of coins they own
	public String parentTransactionId; // the id of the transaction this output was created in

	// Constructor
	/**
	 * @param reciepient
	 * @param value
	 * @param parentTransactionId
	 */
	public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId) {
		this.reciepient = reciepient;
		this.value = value;
		this.parentTransactionId = parentTransactionId;
		this.id = StringUtil
				.applySha256(StringUtil.getStringFromKey(reciepient) + Float.toString(value) + parentTransactionId);
	}

	// Check if coin belongs to you
	/**
	 * @param publicKey
	 * @return
	 */
	public boolean isMine(PublicKey publicKey) {
		return (publicKey == reciepient);
	}

}
