package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Long;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q$Q.Long$Flot;
import CC.$.Q2$.Long_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Long<From_Typ> extends
	Get_Flot_By_Long,
	Set_Q_By_Long<From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Long_Flot$
{
	@Lin_Dclar void Set_Flot_By_Long(long By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Flot$(long By,float Valu){Set_Flot_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Long_Sorc(long By,Long$Flot Sorc){Set_Flot_By_Long(By,Sorc.Long$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Long(long By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Long(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Long_Sorc(long By,Flot1$1 Fun,Long$Flot Sorc)
			{Set_Flot1$1_By_Long(By,Fun,Sorc.Long$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Long(long By,Flot1$1 Fun)
				{Set_Flot1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Long(long By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Long(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Long_SLit(long By,Flot2$1 Fun,Long$Flot A,float B)
			{Set_Flot2$1_By_Long(By,Fun,A.Long$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Long(long By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Long_Sorc(long By,Flot2$1 Fun,Long$Flot A,Long$Flot B)
				{Set_Flot2$1_By_Long_SLit(By,Fun,A,B.Long$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Long_Sorc(long By,Flot2$1 Fun,Long$Flot B)
					{Set_Flot2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Long(long By,float Valu)
	{
		float Stor=Get_Flot_By_Long(By);
		Set_Flot_By_Long(By,Valu);

		return Stor;
	}
}