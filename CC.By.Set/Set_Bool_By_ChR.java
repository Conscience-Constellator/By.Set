package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_ChR;
import CC.Util.By.LMNt.*;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.ChR$Bool;
import CC.$.Q2$.ChR_Bool$;
import CC.$.Q_Q$Q.Bool2$1;

public interface Set_Bool_By_ChR<From_Typ> extends
	Get_Bool_By_ChR,
	Set_Bool_By_Q<From_Typ>,
	Set_Q_By_ChR<From_Typ>,
	ChR_Bool$
{
	@Lin_Dclar
	void Set_Bool_By_ChR(char By,boolean Valu);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChR_Bool$(char A,boolean B){Set_Bool_By_ChR(A,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_ChR_Sorc(char By,ChR$Bool Sorc){Set_Bool_By_ChR(By,Sorc.ChR$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Bool(char By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_ChR(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_ChR_Sorc(char By,Bool$Bool Fun,ChR$Bool Sorc)
			{Set_Bool1$1_By_Bool(By,Fun,Sorc.ChR$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_ChR(char By,Bool$Bool Fun)
				{Set_Bool1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Bool(char By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_ChR(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_ChR_SLit(char By,Bool2$1 Fun,ChR$Bool A,boolean B)
			{Set_Bool2$1_By_Bool(By,Fun,A.ChR$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_ChR(char By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_ChR_Sorc(char By,Bool2$1 Fun,ChR$Bool A,ChR$Bool B)
				{Set_Bool2$1_By_ChR_SLit(By,Fun,A,B.ChR$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_ChR_Sorc(char By,Bool2$1 Fun,ChR$Bool B)
					{Set_Bool2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_ChR(char By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_ChR(By);
		Set_Bool_By_ChR(By,Valu);

		return Stor;
	}
}