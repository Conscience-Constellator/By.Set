package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_ChR;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.ChR$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.ChR_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_ChR<From_Typ> extends
	Get_Long_By_ChR,
	Set_Q_By_ChR<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	ChR_Long$
{
	@Lin_Dclar
	void Set_Long_By_ChR(char By,long Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void ChR_Long$(char By,long Valu)
		{Set_Long_By_ChR(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Long_By_ChR_Sorc(char By,ChR$Long Sorc)
		{Set_Long_By_ChR(By,Sorc.ChR$Long(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Long1$1_By_ChR(char By,Long1$1 Fun,long Valu)
		{Set_Long_By_ChR(By,Fun.Long1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Long1$1_By_ChR_Sorc(char By,Long1$1 Fun,ChR$Long Sorc)
			{Set_Long1$1_By_ChR(By,Fun,Sorc.ChR$Long(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Long1$1_By_ChR(char By,Long1$1 Fun)
				{Set_Long1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Long2$1_By_ChR(char By,Long2$1 Fun,long A,long B)
		{Set_Long_By_ChR(By,Fun.Long2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Long2$1_By_ChR_SLit(char By,Long2$1 Fun,ChR$Long A,long B)
			{Set_Long2$1_By_ChR(By,Fun,A.ChR$Long(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Long2$1_By_ChR(char By,Long2$1 Fun,long B)
				{Set_Long2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Long2$1_By_ChR_Sorc(char By,Long2$1 Fun,ChR$Long A,ChR$Long B)
				{Set_Long2$1_By_ChR_SLit(By,Fun,A,B.ChR$Long(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Long2$1_By_ChR_Sorc(char By,Long2$1 Fun,ChR$Long B)
					{Set_Long2$1_By_ChR_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default long SGet_Long_By_ChR(char By,long Valu)
	{
		long Stor=Get_Long_By_ChR(By);
		Set_Long_By_ChR(By,Valu);

		return Stor;
	}
}