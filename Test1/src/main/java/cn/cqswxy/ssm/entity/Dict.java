package cn.cqswxy.ssm.entity;

public class Dict {

	private Integer dictId;
	private String dictTypeCode;
	private String dictTypeName;
	private String dictItemCode;
	private String dictItemName;
	private Integer dictSort;
	private Boolean dictFlag;
	private String dictRemark;
	public Integer getDictId() {
		return dictId;
	}
	public void setDictId(Integer dictId) {
		this.dictId = dictId;
	}
	public String getDictTypeCode() {
		return dictTypeCode;
	}
	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}
	public String getDictTypeName() {
		return dictTypeName;
	}
	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}
	public String getDictItemCode() {
		return dictItemCode;
	}
	public void setDictItemCode(String dictItemCode) {
		this.dictItemCode = dictItemCode;
	}
	public String getDictItemName() {
		return dictItemName;
	}
	public void setDictItemName(String dictItemName) {
		this.dictItemName = dictItemName;
	}
	public Integer getDictSort() {
		return dictSort;
	}
	public void setDictSort(Integer dictSort) {
		this.dictSort = dictSort;
	}
	public Boolean getDictFlag() {
		return dictFlag;
	}
	public void setDictFlag(Boolean dictFlag) {
		this.dictFlag = dictFlag;
	}
	public String getDictRemark() {
		return dictRemark;
	}
	public void setDictRemark(String dictRemark) {
		this.dictRemark = dictRemark;
	}
	@Override
	public String toString() {
		return "Dict [dictId=" + dictId + ", dictTypeCode=" + dictTypeCode + ", dictTypeName=" + dictTypeName
				+ ", dictItemCode=" + dictItemCode + ", dictItemName=" + dictItemName + ", dictSort=" + dictSort
				+ ", dictFlag=" + dictFlag + ", dictRemark=" + dictRemark + "]";
	}
	
	
}
