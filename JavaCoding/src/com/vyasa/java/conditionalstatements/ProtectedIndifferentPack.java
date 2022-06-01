package com.vyasa.java.conditionalstatements;

import com.vyasa.java.oops.ProtectedAccess;

public class ProtectedIndifferentPack extends ProtectedAccess{

	public static void main(String[] args) {
		//ProtectedAccess obj=new ProtectedAccess();
		//obj.x=800;
		
		ProtectedIndifferentPack objderived=new ProtectedIndifferentPack();
		objderived.x=700;
		objderived.dispaly();
	}

}
