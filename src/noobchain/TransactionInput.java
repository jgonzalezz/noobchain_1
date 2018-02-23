package noobchain;

//Esta clase se usará para hacer referencia a TransactionOutputs que aún no se han gastado. 
//El transactionOutputId se usará para encontrar el TransactionOutput relevante, permitiendo a los mineros verificar su propiedad.
/**
 * @author JGonzalezLo
 *
 */
public class TransactionInput {
	public String transactionOutputId; // Reference to TransactionOutputs -> transactionId
	public TransactionOutput UTXO; // Contains the Unspent transaction output

	/**
	 * @param transactionOutputId
	 */
	public TransactionInput(String transactionOutputId) {
		this.transactionOutputId = transactionOutputId;
	}
}
