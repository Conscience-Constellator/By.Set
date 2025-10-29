package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Byt_By_Long;
import CC.Util.By.LMNt.Set_Byt_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Byt$Byt;
import CC.$.Q$Q.Long$Byt;
import CC.$.Q2$.Long_Byt$;
import CC.$.Q_Q$Q.Byt2$1;

public interface Set_Byt_By_Long<From_Typ> extends
	Get_Byt_By_Long,
	Set_Byt_By_Q<From_Typ>,
	Set_Q_By_Long<From_Typ>,
	Long_Byt$
{
	@Lin_Dclar void Set_Byt_By_Long(long By,byte Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Byt$(long By,byte Valu){Set_Byt_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt_By_Long_Sorc(byte By,Long$Byt Sorc){Set_Byt_By_Long(By,Sorc.Long$Byt(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt1$1_By_Long(long By,Byt$Byt Fun,byte Valu)
		{Set_Byt_By_Long(By,Fun.Byt$Byt(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt1$1_By_Long_Sorc(long By,Byt$Byt Fun,Long$Byt Sorc)
			{Set_Byt1$1_By_Long(By,Fun,Sorc.Long$Byt(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt1$1_By_Long(long By,Byt$Byt Fun)
				{Set_Byt1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Byt2$1_By_Long(long By,Byt2$1 Fun,byte A,byte B)
		{Set_Byt_By_Long(By,Fun.Byt2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Byt2$1_By_Long_SLit(long By,Byt2$1 Fun,Long$Byt A,byte B)
			{Set_Byt2$1_By_Long(By,Fun,A.Long$Byt(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Byt2$1_By_Long(long By,Byt2$1 Fun,byte B)
				{Set_Byt2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Byt2$1_By_Long_Sorc(long By,Byt2$1 Fun,Long$Byt A,Long$Byt B)
				{Set_Byt2$1_By_Long_SLit(By,Fun,A,B.Long$Byt(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Byt2$1_By_Long_Sorc(long By,Byt2$1 Fun,Long$Byt B)
					{Set_Byt2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default byte SGet_Byt_By_Long(long By,byte Valu)
	{
		byte Stor=Get_Byt_By_Long(By);
		Set_Byt_By_Long(By,Valu);

		return Stor;
	}
}