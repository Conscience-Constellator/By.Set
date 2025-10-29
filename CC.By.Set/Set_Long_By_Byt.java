package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Long_By_Byt;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Byt;
import CC.$.Q$Q.Byt$Long;
import CC.$.Q$Q.Long1$1;
import CC.$.Q2$.Byt_Long$;
import CC.$.Q_Q$Q.Long2$1;

public interface Set_Long_By_Byt<From_Typ> extends
	Get_Long_By_Byt,
	Set_Q_By_Byt<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Byt_Long$
{
	@Lin_Dclar void Set_Long_By_Byt(byte By,long Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Byt_Long$(byte By,long Valu){Set_Long_By_Byt(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long_By_Byt_Sorc(byte By,Byt$Long Sorc){Set_Long_By_Byt(By,Sorc.Byt$Long(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long1$1_By_Byt(byte By,Long1$1 Fun,long Valu)
		{Set_Long_By_Byt(By,Fun.Long1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long1$1_By_Byt_Sorc(byte By,Long1$1 Fun,Byt$Long Sorc)
			{Set_Long1$1_By_Byt(By,Fun,Sorc.Byt$Long(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long1$1_By_Byt(byte By,Long1$1 Fun)
				{Set_Long1$1_By_Byt_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Long2$1_By_Byt(byte By,Long2$1 Fun,long A,long B)
		{Set_Long_By_Byt(By,Fun.Long2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Long2$1_By_Byt_SLit(byte By,Long2$1 Fun,Byt$Long A,long B)
			{Set_Long2$1_By_Byt(By,Fun,A.Byt$Long(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Long2$1_By_Byt(byte By,Long2$1 Fun,long B)
				{Set_Long2$1_By_Byt_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Long2$1_By_Byt_Sorc(byte By,Long2$1 Fun,Byt$Long A,Byt$Long B)
				{Set_Long2$1_By_Byt_SLit(By,Fun,A,B.Byt$Long(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Long2$1_By_Byt_Sorc(byte By,Long2$1 Fun,Byt$Long B)
					{Set_Long2$1_By_Byt_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default long SGet_Long_By_Byt(byte By,long Valu)
	{
		long Stor=Get_Long_By_Byt(By);
		Set_Long_By_Byt(By,Valu);

		return Stor;
	}
}