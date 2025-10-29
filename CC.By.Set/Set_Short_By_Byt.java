package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Short_By_Byt;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.Util.By.LMNt.Set_Short_By_Q;
import CC.$.Q$Q.Byt$Short;
import CC.$.Q$Q.Short1$1;
import CC.$.Q2$.Byt_Short$;
import CC.$.Q_Q$Q.Short2$1;

public interface Set_Short_By_Byt<From_Typ> extends
	Get_Short_By_Byt,
	Set_Q_By_Byt<From_Typ>,
	Set_Short_By_Q<From_Typ>,
	Byt_Short$
{
	@Lin_Dclar
	void Set_Short_By_Byt(byte By,short Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Byt_Short$(byte By,short Valu)
		{Set_Short_By_Byt(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short_By_Byt_Sorc(byte By,Byt$Short Sorc)
		{Set_Short_By_Byt(By,Sorc.Byt$Short(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short1$1_By_Byt(byte By,Short1$1 Fun,short Valu)
		{Set_Short_By_Byt(By,Fun.Short1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short1$1_By_Byt_Sorc(byte By,Short1$1 Fun,Byt$Short Sorc)
			{Set_Short1$1_By_Byt(By,Fun,Sorc.Byt$Short(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short1$1_By_Byt(byte By,Short1$1 Fun)
				{Set_Short1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Short2$1_By_Byt(byte By,Short2$1 Fun,short A,short B)
		{Set_Short_By_Byt(By,Fun.Short2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Short2$1_By_Byt_SLit(byte By,Short2$1 Fun,Byt$Short A,short B)
			{Set_Short2$1_By_Byt(By,Fun,A.Byt$Short(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Short2$1_By_Byt(byte By,Short2$1 Fun,short B)
				{Set_Short2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Short2$1_By_Byt_Sorc(byte By,Short2$1 Fun,Byt$Short A,Byt$Short B)
				{Set_Short2$1_By_Byt_SLit(By,Fun,A,B.Byt$Short(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Short2$1_By_Byt_Sorc(byte By,Short2$1 Fun,Byt$Short B)
					{Set_Short2$1_By_Byt_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default short SGet_Short_By_Byt(byte By,short Valu)
	{
		short Stor=Get_Short_By_Byt(By);
		Set_Short_By_Byt(By,Valu);

		return Stor;
	}
}