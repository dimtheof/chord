package chord;

public enum Type {
	PRED_SUCC_REQUEST,
	PRED_SUCC_REPLY,
	NEW_SUCC_INFORM,
	PRED_CHAIN_REQUEST,
	SUCC_CHAIN_REQUEST,
	PRED_CHAIN_REPLY,
	SUCC_CHAIN_REPLY,
	DEPART_PRED_CHAIN,
	REQUEST_HASH_TABLE,
	RECEIVE_HASH_TABLE,
	INSERT,
	INSERT_REPLICAS_INFORM,
	INSERT_REPLICAS_OK,
	DELETE,
	DELETE_REPLICAS_INFORM,
	DELETE_REPLICAS_OK,
	QUERY,
	QUERY_TTL,
	QUERYALL,
	QUERY_EC,
	QUERYALL_EC,
	RESPONSE,
	TIMER,
	GRACEFUL_DEPARTURE
}
