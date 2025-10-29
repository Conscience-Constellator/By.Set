package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_ChR;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.ChR$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.ChR_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_ChR<From_Typ> extends
	Get_Int_By_ChR,
	Set_Q_By_ChR<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	ChR_Int$
{
	@Lin_Dclar void Set_Int_By_ChR(char By,int Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void ChR_Int$(char By,int Valu)
		{Set_Int_By_ChR(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int_By_ChR_Sorc(char By,ChR$Int Sorc)
		{Set_Int_By_ChR(By,Sorc.ChR$Int(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int1$1_By_ChR(char By,Int1$1 Fun,int Valu)
		{Set_Int_By_ChR(By,Fun.Int1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Int1$1_By_ChR_Sorc(char By,Int1$1 Fun,ChR$Int Sorc)
			{Set_Int1$1_By_ChR(By,Fun,Sorc.ChR$Int(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Int1$1_By_ChR(char By,Int1$1 Fun)
				{Set_Int1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Int2$1_By_ChR(char By,Int2$1 Fun,int A,int B)
		{Set_Int_By_ChR(By,Fun.Int2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Int2$1_By_ChR_SLit(char By,Int2$1 Fun,ChR$Int A,int B)
			{Set_Int2$1_By_ChR(By,Fun,A.ChR$Int(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Int2$1_By_ChR(char By,Int2$1 Fun,int B)
				{Set_Int2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Int2$1_By_ChR_Sorc(char By,Int2$1 Fun,ChR$Int A,ChR$Int B)
				{Set_Int2$1_By_ChR_SLit(By,Fun,A,B.ChR$Int(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Int2$1_By_ChR_Sorc(char By,Int2$1 Fun,ChR$Int B)
					{Set_Int2$1_By_ChR_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default int SGet_Int_By_ChR(char By,int Valu)
	{
		int Stor=Get_Int_By_ChR(By);
		Set_Int_By_ChR(By,Valu);

		return Stor;
	}
}